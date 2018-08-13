package com.mayw.pattendesign20180810.state11;

public class Context {
    private FatherClass fatherClass;

    public FatherClass getFatherClass() {
        return fatherClass;
    }

    public void setFatherClass(FatherClass fatherClass) {
        this.fatherClass = fatherClass;
    }

    public void request(){
        fatherClass.handle(this);
    }

}
