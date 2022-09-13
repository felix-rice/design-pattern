package com.felix.design.pattern.singleton;

/**
 * @author lixin40 <lixin40@kuaishou.com>
 * Created on 2022-09-13
 */
public class InnerStaticClassSingleton {
    private static class SingletonHolder {
        private static final InnerStaticClassSingleton SINGLETON = new InnerStaticClassSingleton();
    }
    private final String name;
    private InnerStaticClassSingleton() {
        name = "InnerStaticClassSingleton";
    }
    public static InnerStaticClassSingleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public String getName() {
        return name;
    }
}
