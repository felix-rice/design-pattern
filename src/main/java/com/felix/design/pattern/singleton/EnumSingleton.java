package com.felix.design.pattern.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lixin40 <lixin40@kuaishou.com>
 * Created on 2022-09-13
 */
@Slf4j
public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        log.info("do something you like.");
    }
}
