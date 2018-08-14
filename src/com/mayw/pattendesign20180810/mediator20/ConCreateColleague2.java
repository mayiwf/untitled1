package com.mayw.pattendesign20180810.mediator20;

public class ConCreateColleague2 extends Colleague{
    public ConCreateColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事2得到信息--" + message);

    }


}
