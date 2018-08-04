package org.worldreservesystem.core.iplookup;

import java.io.IOException;

/**
 * @author ramin
 *
 */
public class WrsIpLookup {

	public static void main(String[] args) {

		LookupService cl;
		try {
			cl = new LookupService("src/org/worldreservesystem/core/iplookup/db/GeoIPCity.dat",
					LookupService.GEOIP_INDEX_CACHE);
			Location l1 = cl.getLocation("222.230.137.0");

			System.out.println(l1.area_code);
			System.out.println(l1.city);
			System.out.println(l1.countryCode);
			System.out.println(l1.countryName);
			System.out.println(l1.dma_code);
			System.out.println(l1.latitude);
			System.out.println(l1.longitude);
			System.out.println(l1.metro_code);
			System.out.println(l1.postalCode);
			System.out.println(l1.region);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
