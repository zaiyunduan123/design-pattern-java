package com.jiang.design.建造者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 9:06 AM
 *
 * 抽象建造者
 */
public abstract class Builder {
    //设置产品的不同部分，以获得不同的产品
    public abstract void setPart();
    //建造产品
    public abstract Product buildProduct();
}
