package com.proxy.dynamicProxy;

/**
 * 抽象主题角色：声明真实主题和代理主题的共同接口，任何使用真实主题的地方都可以使用代理主题
 */
public interface Subject {

    /**
     * 定义一个请求方法
     */
    void doRequest();
}
