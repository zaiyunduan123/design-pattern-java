package com.jiang.design.访问者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 7:02 PM
 */
public class ConcreteElement2 extends Element {
    public void doSomething() {

    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
