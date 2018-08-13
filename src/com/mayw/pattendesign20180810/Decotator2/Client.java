package com.mayw.pattendesign20180810.Decotator2;

public class Client {
    public static void main(String[] args) {
        System.out.println("开时装扮了");
        People people = new People();
        Son1 son1 = new Son1(people);
        Son2 son2 = new Son2(son1);
        Son1 son3 = new Son1(son2);
        Son2 son4 = new Son2(son3);
        son4.doSomething();




    }
}
