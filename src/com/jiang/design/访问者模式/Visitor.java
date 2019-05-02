package com.jiang.design.访问者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 7:05 PM
 */
public class Visitor implements IVisitor {
    public void visit(ConcreteElement1 element1) {
        element1.doSomething();
    }

    public void visit(ConcreteElement2 element2) {
        element2.doSomething();
    }
}
