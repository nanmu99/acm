package com.ppp.mediator.smarthouse;

/**
 * @auther ppp
 * @create 2021-07-05 21:00
 */
public abstract class Mediator {
    //将给中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
