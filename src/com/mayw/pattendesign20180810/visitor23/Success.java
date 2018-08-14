package com.mayw.pattendesign20180810.visitor23;

public class Success extends Action{
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "背后多半有一个不成功的男人");

    }
}
