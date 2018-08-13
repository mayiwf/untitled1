package com.mayw.pattendesign20180810.proxy3;

/**
 * this is patten design proxy test
 */
public class Client {
    public static void main(String[] args) {
        // 创建真实的类
        RealClass realClass = new RealClass();
        // 创建代理类
        ProxyClass proxyClass = new ProxyClass();
        // 将真实的类引入代理类
        proxyClass.setRealClass(realClass);
        // 代理的类执行送礼物的操作
        proxyClass.doSomething();



    }


}