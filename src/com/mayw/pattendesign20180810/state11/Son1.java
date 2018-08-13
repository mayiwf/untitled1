package com.mayw.pattendesign20180810.state11;

public class Son1 extends FatherClass {
    @Override
    public void handle(Context context) {
        System.out.println("son1 handle");

        context.setFatherClass(new Son2());


    }
}
