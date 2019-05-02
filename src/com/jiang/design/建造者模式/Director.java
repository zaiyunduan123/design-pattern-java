package com.jiang.design.建造者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 9:11 AM
 *
 * 导演类
 */
public class Director {
   private Builder builder = new ConcreteProduct();
   //构造不同的产品
    public Product getAProduct(){
        builder.setPart();
        /**
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }

}
