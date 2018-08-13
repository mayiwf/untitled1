package com.mayw.pattendesign20180810.strategy1;

public class Client {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConCreteStrategyA());
        context.ContextInterface();
        context = new Context(new ConCreteStrategyB());
        context.ContextInterface();
        context = new Context(new ConCreteStrategyC());
        context.ContextInterface();

    }


}
