package com.mayw.pattendesign20180810.builder8;

public class Director {
    public Persion constructPersion(PersionBuilder pb){
        pb.builderBody();
        pb.builderHead();
        pb.buildFoot();
        return pb.builderPersion();
    }

}
