package com.mayw.pattendesign20180810.mediator20;

public class ConCreateMediator extends Mediator{
    private ConCreateColleague1 conCreateColleague1;
    private ConCreateColleague2 conCreateColleague2;




    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == conCreateColleague1){
            conCreateColleague2.notify(message);
        }
        if (colleague == conCreateColleague2){
            conCreateColleague1.notify(message);
        }




    }


    public ConCreateColleague1 getConCreateColleague1() {
        return conCreateColleague1;
    }

    public void setConCreateColleague1(ConCreateColleague1 conCreateColleague1) {
        this.conCreateColleague1 = conCreateColleague1;
    }

    public ConCreateColleague2 getConCreateColleague2() {
        return conCreateColleague2;
    }

    public void setConCreateColleague2(ConCreateColleague2 conCreateColleague2) {
        this.conCreateColleague2 = conCreateColleague2;
    }
}
