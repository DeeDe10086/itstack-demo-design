package org.itstack.demo.desgin.factory.impl;

import org.itstack.demo.desgin.factory.ICacheAdapter;
import org.itstack.demo.design.matter.EGM;

import java.util.concurrent.TimeUnit;

public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    public String get(String key) {
        System.out.println("EGMCacheAdapter");
        return egm.gain(key);
    }

    public void set(String key, String value) {
        System.out.println("EGMCacheAdapter");
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        System.out.println("EGMCacheAdapter");
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        System.out.println("EGMCacheAdapter");
        egm.delete(key);
    }
}
