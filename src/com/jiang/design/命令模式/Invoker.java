package com.jiang.design.命令模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 12:01 PM
 *
 * 调用者Invoker类
 */
public class Invoker {
    private Command command;
    //接受命令
    public void setCommand(Command command){
        this.command=command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}
