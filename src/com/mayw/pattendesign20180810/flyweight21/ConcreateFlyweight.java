package com.mayw.pattendesign20180810.flyweight21;

/**
 * 这是共享的类
 */
public class ConcreateFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsistate) {
        System.out.println("具体的Flyweight" + extrinsistate);

    }
}
