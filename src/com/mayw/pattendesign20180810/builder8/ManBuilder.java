package com.mayw.pattendesign20180810.builder8;

public class ManBuilder implements PersionBuilder {
    Persion persion = new Persion();

    @Override
    public void builderHead() {
        persion.setHead("建造男人的头");
    }

    @Override
    public void builderBody() {
        persion.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        persion.setFoot("建造男人的四肢");
    }

    @Override
    public Persion builderPersion() {
        return persion;
    }
}
