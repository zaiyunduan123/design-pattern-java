package com.jiang.design.工厂方法模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 1:41 AM
 *
 * 抽象工厂类
 */
public abstract class Creator {

    //创建一个产品对象，输入参数类可以自行设置
    public abstract <T extends Product> T createProduct(Class<T> c);
}
