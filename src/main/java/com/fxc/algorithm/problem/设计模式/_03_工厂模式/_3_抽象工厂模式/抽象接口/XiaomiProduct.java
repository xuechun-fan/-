package com.fxc.algorithm.problem.设计模式._03_工厂模式._3_抽象工厂模式.抽象接口;

/**
 * Description：
 */
public abstract class XiaomiProduct implements Product {
    @Override
    public void printBrand() {
        System.out.println("我是小米生产的：");
    }
}
