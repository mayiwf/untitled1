package com.mayw.pattendesign20180810.visitor23;

public class Woman extends Persion{
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);

    }
}
