package com.jiang.design.迭代器模式;

import java.util.Vector;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:52 PM
 *
 * 具体容器
 */
public class ConcreteAggregate implements Aggregate{
    //容纳对象的容器
    private Vector vector = new Vector();
    public void add(Object object) {
        this.vector.add(object);
    }

    public void remove(Object object) {
         this.remove(object);
    }

    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
