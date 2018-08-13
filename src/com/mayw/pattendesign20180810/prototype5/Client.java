package com.mayw.pattendesign20180810.prototype5;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.string = "你好";
        Prototype prototype1 = (Prototype)prototype.clone();
        prototype1.string = "你不好";
        System.out.println(prototype.string + "|" + prototype1.string);
        




    }


}
