package com.jiang.design.抽象工厂模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 8:16 AM
 *
 * 产品等级2的实现类
 */
public class Creator2 extends AbstractCreator {
    //只生产产品等级2的A产品
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    //只生产产品等级2的B产品
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
