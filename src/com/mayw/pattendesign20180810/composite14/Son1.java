package com.mayw.pattendesign20180810.composite14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Son1 extends Father{
    private List<Father> list = new ArrayList<>();
    public Son1(String name) {
        super.name = name;
    }

    @Override
    protected void add(Father father) {
        list.add(father);
    }

    @Override
    protected void remove(Father father) {
        list.remove(father);
    }

    @Override
    protected void LineOfDaty() {
        System.out.println(name + "做事情");
        Iterator<Father> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().LineOfDaty();
        }


    }
}
