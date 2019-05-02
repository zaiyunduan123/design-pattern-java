package com.jiang.design.代理模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 9:27 AM
 */
public class Proxy implements Subject{
    //要代理哪个实现类
    private Subject subject = null;
    //默认被代理者
    public Proxy(){
        this.subject = new Proxy();
    }
    //通过构造函数传递代理者
    public Proxy(Object ... objects){
    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
    //预处理
    private void before(){

    }
    //后处理
    private void after(){

    }

}
