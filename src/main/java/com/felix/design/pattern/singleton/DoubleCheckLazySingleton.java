package com.felix.design.pattern.singleton;

/**
 * @author lixin40 <lixin40@kuaishou.com>
 * Created on 2022-09-13
 */
public class DoubleCheckLazySingleton {
    private final String name;
    private static volatile DoubleCheckLazySingleton doubleCheckLazySingleton;
    private DoubleCheckLazySingleton() {
        name = "DoubleCheckLazySingleton";
    }
    public static DoubleCheckLazySingleton getInstance() {
        if (doubleCheckLazySingleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                doubleCheckLazySingleton = new DoubleCheckLazySingleton();
            }
        }
        return doubleCheckLazySingleton;
    }
    public String getName() {
        return name;
    }
}
