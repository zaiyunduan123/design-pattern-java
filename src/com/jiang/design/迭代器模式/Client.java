package com.jiang.design.迭代器模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:54 PM
 */
public class Client {
    public static void main(String[] args) {
        Aggregate agg=new ConcreteAggregate();
        agg.add("abc");
        agg.add("123");
        agg.add("kkk");
        Iterator iterator = agg.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
