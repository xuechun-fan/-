package com.fxc.algorithm.problem.设计模式._03_工厂模式._3_抽象工厂模式.实体类;

import com.fxc.algorithm.problem.设计模式._03_工厂模式._3_抽象工厂模式.抽象接口.LenovoProduct;

/**
 * Description：
 */
public class LenovoTV extends LenovoProduct {
    @Override
    public void printProductClass() {
        System.out.println("电视机");
    }
}
