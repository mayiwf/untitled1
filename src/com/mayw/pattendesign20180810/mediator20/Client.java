package com.mayw.pattendesign20180810.mediator20;

public class Client {
    public static void main(String[] args) {
        ConCreateMediator m = new ConCreateMediator();

        ConCreateColleague1 conCreateColleague1 = new ConCreateColleague1(m);
        ConCreateColleague2 conCreateColleague2 = new ConCreateColleague2(m);


        m.setConCreateColleague1(conCreateColleague1);
        m.setConCreateColleague2(conCreateColleague2);


        conCreateColleague1.send("你吃饭了没？");
        conCreateColleague2.send("我吃过了！");



    }


}
