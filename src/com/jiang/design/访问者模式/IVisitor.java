package com.jiang.design.访问者模式;

public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement1 element1);

    public void visit(ConcreteElement2 element2);
}
