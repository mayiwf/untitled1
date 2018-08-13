package com.mayw.pattendesign20180810.composite14;

public class Son2 extends Father{
    public Son2(String name) {
        super.name = name;
    }

    @Override
    protected void add(Father father) {

    }

    @Override
    protected void remove(Father father) {

    }

    @Override
    protected void LineOfDaty() {
        System.out.println(super.name + "做事情");
    }
}
