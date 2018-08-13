package com.mayw.pattendesign20180810.Decotator2;

/**
 * 被装扮的人
 */
public class People extends Decorator{
    @Override
    protected void doSomething() {
        System.out.println("装扮的人。→");
    }
}
