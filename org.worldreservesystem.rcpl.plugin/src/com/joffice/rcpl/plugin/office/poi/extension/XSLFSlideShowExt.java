/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package com.joffice.rcpl.plugin.office.poi.extension;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xslf.XSLFSlideShow;
import org.apache.xmlbeans.XmlException;

public class XSLFSlideShowExt extends XSLFSlideShow {

	public XSLFSlideShowExt(OPCPackage arg0) throws OpenXML4JException,
			IOException, XmlException {
		super(arg0);
	}

}
