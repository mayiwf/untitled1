package com.mayw.pattendesign20180810.singleton16;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton1);
        System.out.println(singleton.equals(singleton2));

    }

}
