package com.mayw.pattendesign20180810.chainofresponsibility19;

public class ConcreateHandle2 extends Handler{
    @Override
    protected void handlerResuest(int request) {
        if (request >= 5){
            System.out.println("我是" + this.getClass().getSimpleName() + "处理请求");
        } else {
            System.out.println("我是" + this.getClass().getSimpleName() + "没有权限");
            handler.handlerResuest(request);
        }

    }
}
