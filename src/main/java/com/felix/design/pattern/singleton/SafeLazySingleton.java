package com.felix.design.pattern.singleton;

/**
 * @author lixin40 <lixin40@kuaishou.com>
 * Created on 2022-09-13
 */
public class SafeLazySingleton {
    private final String name;
    private static SafeLazySingleton singleton;
    private SafeLazySingleton() {
        name = "SafeLazySingleton";
    }
    public static synchronized SafeLazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new SafeLazySingleton();
        }
        return singleton;
    }

    public String getName() {
        return name;
    }
}
