package org.itstack.demo.desgin.impl;

import org.itstack.demo.desgin.CacheService;
import org.itstack.demo.design.RedisUtils;

import java.util.concurrent.TimeUnit;

public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        System.out.println("CacheServiceImpl");
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        System.out.println("CacheServiceImpl");
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        System.out.println("CacheServiceImpl");
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        System.out.println("CacheServiceImpl");
        redisUtils.del(key);
    }

}
