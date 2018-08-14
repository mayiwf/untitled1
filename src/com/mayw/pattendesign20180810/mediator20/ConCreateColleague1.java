package com.mayw.pattendesign20180810.mediator20;

public class ConCreateColleague1 extends Colleague{
    public ConCreateColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事1得到信息--" + message);

    }


}
