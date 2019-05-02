package com.jiang.design.模版方法模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 8:24 AM
 *
 * 抽象模版类
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();
    //模版方法

    public void templateMethod(){
        /**
         * 调用基本方法，完成相关逻辑
         */
        this.doAnything();
        this.doSomething();
    }
}
