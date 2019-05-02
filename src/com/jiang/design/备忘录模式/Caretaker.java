package com.jiang.design.备忘录模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 6:11 PM
 *
 * 备忘录管理员角色
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
