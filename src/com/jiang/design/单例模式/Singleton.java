package com.jiang.design.单例模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 1:14 AM
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
