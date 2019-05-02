package com.jiang.design.抽象工厂模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 8:16 AM
 *
 * 产品等级1的实现类
 */
public class Creator1 extends AbstractCreator {
    //只生产产品等级1的A产品
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    //只生产产品等级1的B产品
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
