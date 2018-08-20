package com.proxy.cglibProxy;

/**
 * Created by xh.zhi on 2018-8-20.
 */
public class ClientMain {
    public static void main(String[] args) {
        RealSubject realSubject =(RealSubject) new CglibProxySubject().createProxyInstance(RealSubject.class);
        realSubject.doRequest();
    }
}
