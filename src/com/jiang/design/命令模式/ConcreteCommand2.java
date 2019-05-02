package com.jiang.design.命令模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 11:59 AM
 */
public class ConcreteCommand2 extends Command {
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
