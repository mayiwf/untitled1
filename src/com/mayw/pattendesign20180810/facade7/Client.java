package com.mayw.pattendesign20180810.facade7;

public class Client {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        Facade facade = new Facade(a,b,c);
        facade.close();
        System.out.println("----------------------");
        facade.open();

    }
}
