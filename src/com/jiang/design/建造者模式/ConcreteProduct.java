package com.jiang.design.建造者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 9:10 AM
 *
 * 具体建建造者
 */
public class ConcreteProduct extends Builder{
    private Product product = new Product();
    public void setPart() {

    }

    public Product buildProduct() {
        return product;
    }
}
