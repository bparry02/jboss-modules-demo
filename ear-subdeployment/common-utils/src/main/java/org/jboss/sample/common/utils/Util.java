package org.jboss.sample.common.utils;

import org.apache.commons.lang3.StringUtils;

public class Util 
{
    public static String createHeader(String string)
    {
        if (string == null)
        {
            return null;
        }
        
        int numHeadingChars = 4;
        int totalStringLength = string.length() + numHeadingChars;
        
        return StringUtils.center(string, totalStringLength, ':');
    }
}
