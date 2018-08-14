package com.mayw.pattendesign20180810.interpreter22;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NoterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        Iterator<AbstractExpression> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().interpret(context);
        }

    }


}
