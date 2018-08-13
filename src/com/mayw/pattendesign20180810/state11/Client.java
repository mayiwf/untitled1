package com.mayw.pattendesign20180810.state11;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setFatherClass(new Son1());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();

    }

}
