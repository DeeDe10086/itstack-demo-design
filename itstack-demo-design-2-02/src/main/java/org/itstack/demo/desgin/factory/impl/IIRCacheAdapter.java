package org.itstack.demo.desgin.factory.impl;

import org.itstack.demo.desgin.factory.ICacheAdapter;
import org.itstack.demo.design.matter.IIR;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    public String get(String key) {
        System.out.println("IIRCacheAdapter");
        return iir.get(key);
    }

    public void set(String key, String value) {
        System.out.println("IIRCacheAdapter");
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        System.out.println("IIRCacheAdapter");
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        System.out.println("IIRCacheAdapter");
        iir.del(key);
    }

}
