package com.jiang.design.命令模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 12:04 PM
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        //定义接收者
        ConcreteReciver1 concreteReciver1 = new ConcreteReciver1();
        //定义一个发送给接收者的命令
        ConcreteCommand1 command = new ConcreteCommand1(concreteReciver1);
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
