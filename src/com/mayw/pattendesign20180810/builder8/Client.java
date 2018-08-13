package com.mayw.pattendesign20180810.builder8;

public class Client {


    public static void main(String[] args) {
        Director director = new Director();
        Persion persion = director.constructPersion(new ManBuilder());
        System.out.println(persion.toString());
    }



}
