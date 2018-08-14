package com.mayw.pattendesign20180810.interpreter22;

public class NoterminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
