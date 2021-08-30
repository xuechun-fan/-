package com.fxc.algorithm.problem.设计模式._03_工厂模式.entities;

import com.fxc.algorithm.problem.设计模式._03_工厂模式.abstractInterface.Shape;

/**
 * Description：
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆圈！");
    }
}
