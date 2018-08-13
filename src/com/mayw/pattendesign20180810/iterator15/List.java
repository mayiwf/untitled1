package com.mayw.pattendesign20180810.iterator15;

public interface List {
    public void add(Object obj);
    public Object get(int index);
    public MyIterator iterator();
    public int getSize();
}
