package com.jiang.design.策略模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:14 PM
 */
public class Client {
    public static void main(String[] args) {
        //声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);

        context.doAnything();

    }
}
