package com.jiang.design.装饰模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 4:02 PM
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        //第二次修饰
        component = new ConcreteDecorator2(component);
        //装饰后运行
        component.operate();
    }
}
