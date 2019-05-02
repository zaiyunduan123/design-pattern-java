package com.jiang.design.备忘录模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 6:05 PM
 *
 * 发起人角色
 */
public class Originator {
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public Memento createMemento(){
        return new Memento(this.state);
    }
    //恢复一个备忘录
    public void restoreMemeto(Memento memento){
        this.setState(memento.getState());
    }
}
