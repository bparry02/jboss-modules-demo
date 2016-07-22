package com.redhat.consulting.eapquickstarts.modules.dynamic.utils;

public class Util 
{
    /**
     * A contrived example to help demonstrate class loading with JBoss Modules.
     * 
     * @param string
     * @return
     */
    public static String capitalize(String string)
    {
        if (string == null)
        {
            return null;
        }
        
        return string.toUpperCase();
    }
}
