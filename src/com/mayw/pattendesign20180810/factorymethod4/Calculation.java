package com.mayw.pattendesign20180810.factorymethod4;

public abstract class Calculation {
    /**
     * 参与运算的数字1
     */
    protected double number1;
    /**
     * 参与运算的数字2
     */
    protected double number2;

    public  abstract double toGetResult();


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
