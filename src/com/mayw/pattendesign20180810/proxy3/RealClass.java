package com.mayw.pattendesign20180810.proxy3;

public class RealClass implements GivingGift {
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getName() + " sent flower");
    }
}
