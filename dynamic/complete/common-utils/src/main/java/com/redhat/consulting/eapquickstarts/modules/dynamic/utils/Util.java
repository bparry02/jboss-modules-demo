package com.redhat.consulting.eapquickstarts.modules.dynamic.utils;

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
