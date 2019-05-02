package com.jiang.design.访问者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 7:00 PM
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor visitor);
}
