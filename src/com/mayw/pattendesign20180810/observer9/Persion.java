package com.mayw.pattendesign20180810.observer9;

public abstract class Persion {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void notice();

}
