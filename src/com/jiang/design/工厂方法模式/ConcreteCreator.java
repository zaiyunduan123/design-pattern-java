package com.jiang.design.工厂方法模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 1:42 AM
 *
 *具体工厂类
 */
public class ConcreteCreator extends Creator {
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return (T) product;
    }
}
