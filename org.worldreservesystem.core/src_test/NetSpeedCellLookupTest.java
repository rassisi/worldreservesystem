package org.worldreservesystem.core.iplookup.test;

/* OrgLookupTest.java */

// Need a binary sample dataset

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.worldreservesystem.core.iplookup.LookupService;

public class NetSpeedCellLookupTest {
    @Test
    public void testNetSpeedCellLookup() throws IOException {
        LookupService ns = new LookupService(
                "src/test/resources/GeoIP/GeoIPNetSpeedCell.dat");
        assertEquals("Cable/DSL", ns.getOrg("89.66.148.0"));
        ns.close();
    }
}
