package com.fxc.algorithm.problem.设计模式._01_单例模式.静态内部类方式;

/**
 * 静态内部类方式，多线程安全
 */
class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static final Singleton instance = new Singleton();
    }
}