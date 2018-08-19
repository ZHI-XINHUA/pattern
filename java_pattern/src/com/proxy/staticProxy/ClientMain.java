package com.proxy.staticProxy;

public class ClientMain {
    public static void main(String[] args) {
        //实例代理主题
        ProxySubject proxySubject= new ProxySubject(new RealSubject());
        //通过代理类实现操作
        proxySubject.doRequest();
    }
}
