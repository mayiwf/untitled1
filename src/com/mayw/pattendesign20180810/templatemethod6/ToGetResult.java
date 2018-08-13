package com.mayw.pattendesign20180810.templatemethod6;

public abstract class ToGetResult {
    public double GetResult(){
        return (this.getNumberA() + this.getNumberB());

    }
    protected abstract double getNumberA();
    protected abstract double getNumberB();




}
