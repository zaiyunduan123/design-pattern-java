package com.jiang.design.命令模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 11:30 AM
 *
 * 通用Receiver类
 */
public abstract  class Receiver {
    //抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
