package com.jiang.design.中介者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 11:19 AM
 */
public class ConcreteMediator extends Mediator {
    public void doSomething1() {
        //调用同事类的方法，只要是public方法都可以调用
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    public void doSomething2() {
        //调用同事类的方法，只要是public方法都可以调用
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
