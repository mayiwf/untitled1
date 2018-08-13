package com.mayw.pattendesign20180810.facade7;

public class Facade {
    private ClassA a;
    private ClassB b;
    private ClassC c;

    public Facade() {
    }

    public Facade(ClassA a, ClassB b, ClassC c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void open(){
        a.open();
        b.open();
        c.open();



    }
    public void close(){
        a.close();
        b.close();
        c.close();
    }


}
