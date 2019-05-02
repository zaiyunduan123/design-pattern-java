package com.jiang.design.抽象工厂模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 8:13 AM
 *
 * 抽象工厂类
 */
public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();

    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
