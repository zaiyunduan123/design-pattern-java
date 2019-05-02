package com.jiang.design.迭代器模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:50 PM
 *
 * 抽象容器
 */
public interface Aggregate {
    //是容器必然有元素的增加
    public void add(Object object);
    //减少元素
    public void remove(Object object);
    //由迭代器来遍历所有的元素
    public Iterator iterator();
}
