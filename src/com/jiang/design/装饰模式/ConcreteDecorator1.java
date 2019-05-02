package com.jiang.design.装饰模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 3:58 PM
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }
    //定义自己的修饰方法
    private void method1(){
        System.out.println("method1 修饰");
    }
    //重写父类的Operation方法
    public void operate(){
        this.method1();
        super.operate();
    }
}
