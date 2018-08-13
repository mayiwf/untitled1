package com.mayw.pattendesign20180810.proxy3;

/**
 * 这是一个代理类，与真实的类实现同样的接口，这样真实的类能做的事情，代理类也就能做了
 */
public class ProxyClass implements GivingGift{
    /**
     * introduce realClass ，provide get and set method
     */
    private RealClass realClass;

    public RealClass getRealClass() {
        return realClass;
    }

    public void setRealClass(RealClass realClass) {
        this.realClass = realClass;
    }

    @Override
    public void doSomething() {
        realClass.doSomething();
    }
}
