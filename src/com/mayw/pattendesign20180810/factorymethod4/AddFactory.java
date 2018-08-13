package com.mayw.pattendesign20180810.factorymethod4;

public class AddFactory implements IFactory{
    @Override
    public Calculation createCalculation() {

        return new Add();
    }
}
