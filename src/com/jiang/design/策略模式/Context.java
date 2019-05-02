package com.jiang.design.策略模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:09 PM
 *
 * 封装角色
 */
public class Context {
    //抽象策略
    private Strategy strategy = null;
    //构造函数设置具体策略
    public Context(Strategy strategy){
        this.strategy= strategy;
    }
    //封装后的策略方法
    public void doAnything(){
        this.strategy.doSomething();
    }
}
