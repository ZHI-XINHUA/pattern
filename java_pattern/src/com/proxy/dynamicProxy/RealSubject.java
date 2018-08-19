package com.proxy.dynamicProxy;

import com.proxy.staticProxy.Subject;

/**
 * 真实主题角色：定义类代理角色所代表的真实对象
 */
public class RealSubject implements Subject
{
    @Override
    public void doRequest() {
        System.out.println("真实主题！！");
    }
}
