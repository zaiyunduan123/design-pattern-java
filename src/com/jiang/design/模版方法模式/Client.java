package com.jiang.design.模版方法模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 8:38 AM
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClass1 class1 = new ConcreteClass1();
        ConcreteClass1 class2 = new ConcreteClass1();

        class1.templateMethod();
        class2.templateMethod();

    }
}
