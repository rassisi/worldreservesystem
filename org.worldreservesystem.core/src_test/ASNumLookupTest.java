package org.worldreservesystem.core.iplookup.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.worldreservesystem.core.iplookup.LookupService;

import java.io.IOException;



public class ASNumLookupTest {
	
	@Test
    public void testASNumLookup() throws IOException
    {
    	    LookupService asnl = new LookupService("src/test/resources/GeoIP/GeoIPASNum.dat");
    	    String ASNum = asnl.getOrg("64.17.254.216");
    	    asnl.close();
    	    assertEquals(ASNum, "AS33224");
    }
}
