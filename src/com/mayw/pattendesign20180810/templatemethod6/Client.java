package com.mayw.pattendesign20180810.templatemethod6;

public class Client {
    public static void main(String[] args) {
        ToGetResult toGetResult = new SonClass1();
        double res = toGetResult.GetResult();
        System.out.println(res);
    }
}
