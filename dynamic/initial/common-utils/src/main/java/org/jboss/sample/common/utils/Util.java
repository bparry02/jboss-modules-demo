package org.jboss.sample.common.utils;

public class Util 
{
    public static String capitalize(String string)
    {
        if (string == null)
        {
            return null;
        }
        
        return string.toUpperCase();
    }
}
