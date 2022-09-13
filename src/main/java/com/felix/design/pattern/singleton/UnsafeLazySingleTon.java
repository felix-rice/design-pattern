package com.felix.design.pattern.singleton;

/**
 * @author lixin40 <lixin40@kuaishou.com>
 * Created on 2022-09-13
 */
public class UnsafeLazySingleTon {
    private final String name;
    private static UnsafeLazySingleTon unsafeLazySingleTon;
    private UnsafeLazySingleTon() {
        name = "UnsafeLazySingleTon";
    }

    public static UnsafeLazySingleTon getInstance() {
        if (unsafeLazySingleTon == null) {
            unsafeLazySingleTon = new UnsafeLazySingleTon();
        }
        return unsafeLazySingleTon;
    }

    public String getName() {
        return name;
    }
}
