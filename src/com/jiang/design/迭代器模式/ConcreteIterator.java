package com.jiang.design.迭代器模式;

import java.util.Vector;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:45 PM
 */
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();

    //定义当前游标
    public int cursor=0;
    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector vector){
        this.vector=vector;
    }
    public Object next() {
        Object result = null;
        if (this.hasNext()){
            result = this.vector.get(this.cursor++);
        }else {
            result=null;
        }
        return result;
    }

    public boolean hasNext() {
        if (this.cursor==this.vector.size()){
            return false;
        }else{
            return true;
        }
    }

    //删除当前元素
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
