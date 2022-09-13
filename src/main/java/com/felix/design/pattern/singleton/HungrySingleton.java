package com.felix.design.pattern.singleton;

/**
 * @author lixin40 <lixin40@kuaishou.com>
 * Created on 2022-09-13
 */
public class HungrySingleton {
    private final String name;
    private static final HungrySingleton SINGLETON = new HungrySingleton();
    private HungrySingleton() {
        name = "HungrySingleton";
    }
    public static HungrySingleton getInstance() {
        return SINGLETON;
    }
    public String getName() {
        return name;
    }
}
