package com.mayw.pattendesign20180810.adapter12;

public class Adapter extends Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
