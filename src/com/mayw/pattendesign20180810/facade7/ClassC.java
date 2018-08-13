package com.mayw.pattendesign20180810.facade7;

public class ClassC {
    public void open(){
        System.out.println(this.getClass().getSimpleName() + "|" + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    public void close(){
        System.out.println(this.getClass().getSimpleName() + "|" + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

}
