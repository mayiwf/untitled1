package com.mayw.pattendesign20180810.flyweight21;

public class Client {
    public static void main(String[] args) {

        UnshardConcreateFlyweight unshardConcreateFlyweight = new UnshardConcreateFlyweight();
        int nmuber = 24;

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getFlyweight("x").operation(nmuber--);
        flyweightFactory.getFlyweight("x").operation(nmuber--);
        flyweightFactory.getFlyweight("x").operation(nmuber--);
        flyweightFactory.getFlyweight("y").operation(nmuber--);
        flyweightFactory.getFlyweight("z").operation(nmuber--);
        unshardConcreateFlyweight.operation(nmuber--);





    }

}
