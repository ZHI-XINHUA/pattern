package com.proxy.dynamicProxy;

public class ClentMain {

    public static void main(String[] args) {
        Subject subject = (Subject) new ProxySubject().newProxyInstance(new RealSubject());
        subject.doRequest();
    }
}
