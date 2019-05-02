package com.jiang.design.备忘录模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 6:06 PM
 *
 * 备忘录角色
 */
public class Memento {
    //发起人的内部状态
    private String state = "";

    public Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
