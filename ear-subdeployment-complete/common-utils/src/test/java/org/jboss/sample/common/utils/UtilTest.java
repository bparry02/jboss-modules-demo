package org.jboss.sample.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilTest {

    @Test
    public void testAddHeader() {
        String result = Util.createHeader("World");
        assertEquals("::World::", result);
    }

}
