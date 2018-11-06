package com.flyweight.inner;

/**
 * Created by xh.zhi on 2018-11-6.
 * 客户端角色（Client）：本角色需要维护一个对所有享元对象的引用。本角色需要自行存储所有共享对象的外蕴状态。
 */
public class Client {
    public static void main(String[] args) {
        //创建一个享元工厂对象
        FlyweightFactory factory = new FlyweightFactory();
        //向享元工厂对象请求一个内蕴状态为a的享元对象
        Flyweight fly = factory.factory("a");
        //已参数方式传入一个外蕴状态
        fly.operation("hello");


        Flyweight fly1 = factory.factory("a");
        //已参数方式传入一个外蕴状态
        fly1.operation("world");

    }
}
