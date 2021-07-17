package com.ppp.command;

/**
 * @auther ppp
 * @create 2021-07-03 22:22
 */
public class LightOffCommand implements Command {
// 聚合LightReceiver

    LightReceiver  light;

    // 构造器
    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
// 调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
// 调用接收者的方法
        light.on();
    }
}
