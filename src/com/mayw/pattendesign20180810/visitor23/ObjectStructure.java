package com.mayw.pattendesign20180810.visitor23;


import com.sun.xml.internal.fastinfoset.stax.events.EmptyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
    private List<Persion> elements = new ArrayList<>();
    public void add(Persion persion) {
        elements.add(persion);

    }
    public void remove(Persion persion){
        elements.remove(persion);
    }
    public void print(Action action){
        Iterator<Persion> iterator = elements.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(action);
        }


    }




}
