package com.mayw.pattendesign20180810.chainofresponsibility19;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreateHandle1();
        Handler h2 = new ConcreateHandle2();
        h1.setHandler(h2);
        h1.handlerResuest(4);
        h1.handlerResuest(8);

    }
}
