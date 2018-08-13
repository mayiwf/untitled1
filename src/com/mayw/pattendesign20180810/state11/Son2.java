package com.mayw.pattendesign20180810.state11;

public class Son2 extends FatherClass {
    @Override
    public void handle(Context context) {
        System.out.println("son2 handle");
        
        context.setFatherClass(new Son1());


    }
}
