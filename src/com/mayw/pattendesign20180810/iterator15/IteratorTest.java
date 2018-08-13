package com.mayw.pattendesign20180810.iterator15;

public class IteratorTest {
    /**
     * @param args
     */
    public static void main(String[] args) {

        List list=new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        MyIterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
