package org.jboss.as.quickstarts.helloworld.util;

public class UiClassUtils {

    public static String findClass(String clazz) {
        
        Class<?> foundClass = null;
        
        try {
            foundClass = UiClassUtils.class.getClassLoader().loadClass(clazz);
        } catch (ClassNotFoundException e) {
            return "not found";
        }
        
        return foundClass.getName();
    }

}
