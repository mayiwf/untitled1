package com.mayw.pattendesign20180810.observer9;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
    protected String message;
    protected String name;
    private List<Persion> list = new ArrayList<>();


    public void add(Persion p){
       list.add(p);

    }
    public void remove(Persion p){
        list.remove(p);

    }
    public void notice(){
        Iterator<Persion> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().notice();
        }
    }



}
