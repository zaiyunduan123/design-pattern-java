package com.jiang.design.中介者模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 11:05 AM
 *
 * 抽象同事类
 */
public class Colleague {
    protected Mediator mediator;
    public  Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
