package com.ppp.command;

/**
 * @auther ppp
 * @create 2021-07-03 22:21
 */
//创建命令接口
public interface Command {
    //执行动作(操作)
    public void execute();
    //撤销动作(操作)
    public void undo();
}
