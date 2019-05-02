package com.jiang.design.备忘录模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 6:11 PM
 */
public class Client {
    public static void main(String[] args) {
        //定义出发发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复一个备忘录
        originator.restoreMemeto(caretaker.getMemento());
    }
}
