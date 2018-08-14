package com.mayw.pattendesign20180810.visitor23;

public class Client {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        Success success = new Success();

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(man);
        objectStructure.add(woman);
        objectStructure.print(success);

    }

}
