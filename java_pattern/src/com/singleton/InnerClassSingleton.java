package com.singleton;

/**
 * 内部类创建单例模式.（最优方式）
 * 静态内部类在使用的时候才会加载，所以此种方式属于懒汉式。同时也避免了多线程的问题。
 */
public class InnerClassSingleton {

    //私有化构造函数,防止外部实例化
    private InnerClassSingleton(){};

    public static  InnerClassSingleton getInstance(){
        return SingletonInstance.instance;
    }

    //内部类创建单例模式.
    private static class SingletonInstance{
        static  InnerClassSingleton instance = new InnerClassSingleton();
    }
}
