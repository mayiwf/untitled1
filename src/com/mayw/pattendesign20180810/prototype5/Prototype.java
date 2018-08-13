package com.mayw.pattendesign20180810.prototype5;

public class Prototype implements Cloneable{
    public String string;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
