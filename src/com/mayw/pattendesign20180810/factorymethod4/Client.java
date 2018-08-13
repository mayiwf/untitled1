package com.mayw.pattendesign20180810.factorymethod4;

public class Client {
    public static void main(String[] args) {
        Calculation calculation = new AddFactory().createCalculation();
        calculation.setNumber1(1);
        calculation.setNumber2(2);
        System.out.println("运算的结果是" + calculation.toGetResult());






    }
}
