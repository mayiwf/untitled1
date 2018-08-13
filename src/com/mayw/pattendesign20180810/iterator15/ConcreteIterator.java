package com.mayw.pattendesign20180810.iterator15;


public class ConcreteIterator implements MyIterator {
    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize())
            return false;
            return true;
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index ++ ;
        return object;
    }
}
