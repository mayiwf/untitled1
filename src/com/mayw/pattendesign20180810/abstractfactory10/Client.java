package com.mayw.pattendesign20180810.abstractfactory10;

public class Client {
    public static void main(String[] args) {
        PcFactory pcFactory = new DellFactory();
        pcFactory.createMouse().sayHi();

    }
}
