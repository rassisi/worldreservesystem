/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.xssf.dev;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.poi.openxml4j.opc.internal.ZipHelper;
import org.apache.poi.util.IOUtils;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

/**
 * Utility class which dumps the contents of a *.xlsx file into file system.
 *
 * @author Yegor Kozlov
 */
public final class XSSFDump {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			System.out.println("Dumping " + args[i]);
			ZipFile zip = ZipHelper.openZipFile(args[i]);
			try {
				dump(zip);
			} finally {
				zip.close();
			}
		}
	}

	public static void dump(ZipFile zip) throws Exception {
		String zipname = zip.getName();
		int sep = zipname.lastIndexOf('.');
		File root = new File(zipname.substring(0, sep));
		root.mkdir();
		System.out.println("Dupming to directory " + root);

		Enumeration<? extends ZipEntry> en = zip.entries();
		while (en.hasMoreElements()) {
			ZipEntry entry = en.nextElement();
			String name = entry.getName();
			int idx = name.lastIndexOf('/');
			if (idx != -1) {
				File bs = new File(root, name.substring(0, idx));
				bs.mkdirs();
			}

			File f = new File(root, entry.getName());
			OutputStream out = new FileOutputStream(f);
			try {
				if (entry.getName().endsWith(".xml") || entry.getName().endsWith(".vml")
						|| entry.getName().endsWith(".rels")) {
					try {
						XmlObject xml = XmlObject.Factory.parse(zip.getInputStream(entry));
						XmlOptions options = new XmlOptions();
						options.setSavePrettyPrint();
						xml.save(out, options);
					} catch (Exception e) {
						System.err.println("Failed to parse " + entry.getName() + ", dumping raw content");
						IOUtils.copy(zip.getInputStream(entry), out);
					}
				} else {
					IOUtils.copy(zip.getInputStream(entry), out);
				}
			} finally {
				out.close();
			}
		}
	}
}
