package com.mayw.pattendesign20180810.Decotator2;

public class Son2 extends FatherClass {
    private Decorator decorator;

    public Son2(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    protected void doOwnSomething() {
        System.out.println("装备了盾");
    }

    @Override
    protected void doSomething() {
        decorator.doSomething();
        this.doOwnSomething();
    }
}
