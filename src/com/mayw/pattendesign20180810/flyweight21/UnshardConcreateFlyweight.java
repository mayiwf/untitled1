package com.mayw.pattendesign20180810.flyweight21;

/**
 * 这是不共享的
 */
public class UnshardConcreateFlyweight extends Flyweight{
    @Override
    public void operation(int extrinsistate) {
        System.out.println("不共享的Flyweight");
    }
}
