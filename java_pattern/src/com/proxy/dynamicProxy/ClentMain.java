package com.proxy.dynamicProxy;

public class ClentMain {

    public static void main(String[] args) {
        RealSubject subject = (RealSubject) new ProxySubject().newProxyInstance(new RealSubject());
        subject.doRequest();
    }
}
