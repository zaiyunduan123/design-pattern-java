package com.jiang.design.中介者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 11:07 AM
 */
public class ConcreteColleague2 extends Colleague {
    //通过构造函数传递中介者
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    public void selfMethod2(){

    }
    //依赖方法
    public void depMethod2(){
        //自己不能处理的业务逻辑，委托给中介者处理,其实依赖各个同事类来完成
        super.mediator.doSomething2();
    }
}
