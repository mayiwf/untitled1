package com.mayw.pattendesign20180810.flyweight21;

import java.util.Hashtable;

public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    /**
     * 通过构造方法创建的享元对象
     */
    public FlyweightFactory( ) {
        flyweights.put("x", new ConcreateFlyweight());
        flyweights.put("y", new ConcreateFlyweight());
        flyweights.put("z", new ConcreateFlyweight());



    }



    public Flyweight getFlyweight(String key){
        return (Flyweight) flyweights.get(key);
    }


}
