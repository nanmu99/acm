package com.ppp.mediator.smarthouse;



/**
 * @auther ppp
 * @create 2021-07-05 21:04
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange,this.name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }
}
