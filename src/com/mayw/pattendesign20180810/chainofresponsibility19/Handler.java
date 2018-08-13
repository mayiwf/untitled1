package com.mayw.pattendesign20180810.chainofresponsibility19;

public abstract class Handler {
    protected Handler handler; // 继任者
    protected abstract void handlerResuest(int request);

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
