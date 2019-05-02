package com.jiang.design.适配器模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:28 PM
 *
 * 源角色
 */
public class Adaptee {
    //原本的业务逻辑
    public void doSomething(){
        System.out.println("I am kind of busy, leave me alone,pls");
    }
}
