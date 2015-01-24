package org.jboss.sample.helloworld.util;

public class UiClassUtils {

    public static String findClass(String clazz) {
        
        Class<?> foundClass = null;
        
        // the recommended way of acquiring a classloader instance is to use the
        // classloader that loaded this class. This way, we see the classpath that 
        // we expect created by JBoss Modules
        ClassLoader classLoader = UiClassUtils.class.getClassLoader();
        
        try {
            foundClass = classLoader.loadClass(clazz);
        } catch (ClassNotFoundException e) {
            return "not found";
        }
        
        return foundClass.getName();
    }

}
