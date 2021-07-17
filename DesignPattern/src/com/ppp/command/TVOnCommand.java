package com.ppp.command;

/**
 * @auther ppp
 * @create 2021-07-03 22:24
 */
public class TVOnCommand implements Command {

    // 聚合TVReceiver

    TVReceiver tv;

    // 构造器
    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.off();
    }
}

