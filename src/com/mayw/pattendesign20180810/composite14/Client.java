package com.mayw.pattendesign20180810.composite14;

public class Client {
    public static void main(String[] args) {
        Father f0 = new Son1("0");

        Father f1 = new Son1("1");
        Father f2 = new Son2("2");

        Father f11 = new Son1("11");
        Father f12 = new Son1("12");
        Father f13 = new Son2("13");

        Father f111 = new Son1("111");
        Father f112 = new Son2("112");
        Father f121 = new Son2("121");

        Father f1111 = new Son2("1111");

        f111.add(f1111);

        f11.add(f111);
        f11.add(f112);
        f12.add(f121);

        f1.add(f11);
        f1.add(f12);
        f1.add(f13);

        f0.add(f1);
        f0.add(f2);
        f0.LineOfDaty();
    }
}
