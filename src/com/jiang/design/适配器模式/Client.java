package com.jiang.design.适配器模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:32 PM
 */
public class Client {
    public static void main(String[] args) {
        //原有的业务逻辑
        Target target=new ConcreteTarget();
        target.request();
        //现在增加类适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
