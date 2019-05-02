package com.jiang.design.装饰模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 3:51 PM
 *
 * 抽象装饰者
 */
public abstract class Decorator extends Component {
    private Component component =null;
    //通过构造函数传递被装饰者
    public Decorator(Component component){
        this.component=component;
    }
    public void operate() {
        this.component.operate();
    }
}
