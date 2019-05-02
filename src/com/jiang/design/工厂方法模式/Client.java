package com.jiang.design.工厂方法模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 1:45 AM
 */
public class Client {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        ConcreteProduct1 product = concreteCreator.createProduct(ConcreteProduct1.class);

    }
}
