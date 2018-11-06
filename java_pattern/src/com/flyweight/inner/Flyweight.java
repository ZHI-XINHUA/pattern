package com.flyweight.inner;

/**
 * Created by xh.zhi on 2018-11-6.
 * 抽象享元角色（Flyweight）：是多有具体享元类的超类，为这些类规定需要实现的公共接口。那些需要外蕴状态的操作可以通过调用方法以参数形式传入
 */
public abstract  class Flyweight {

    /**
     * 一个示意的方法，参数outState是外蕴状态
     * @param outState
     */
    abstract public void operation(String outState);
}
