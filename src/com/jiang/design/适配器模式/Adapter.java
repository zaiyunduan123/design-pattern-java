package com.jiang.design.适配器模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:31 PM
 *
 * 适配器角色
 */
public class Adapter extends Adaptee implements Target{
    public void request() {
        super.doSomething();
    }
}
