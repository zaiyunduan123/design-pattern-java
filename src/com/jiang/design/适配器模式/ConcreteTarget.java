package com.jiang.design.适配器模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:27 PM
 *
 *  目标角色的实现类
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
