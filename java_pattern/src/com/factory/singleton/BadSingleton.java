package com.factory.singleton;

/**
 * 单例模式，此种方式实现不支持多线程环境。并发环境会创建多个实例。
 */
public class BadSingleton {

    //静态实例
    private static BadSingleton badSingleton;

    //私有化构造函数,防止外部实例化
    private  BadSingleton(){}

    //实例化对象
    public static BadSingleton getInstance(){
        if(badSingleton==null){
            badSingleton = new BadSingleton();
        }
        return  badSingleton;
    }
}
