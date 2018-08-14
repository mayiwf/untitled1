package com.mayw.pattendesign20180810.visitor23;

public class Man extends Persion{
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);

    }
}
