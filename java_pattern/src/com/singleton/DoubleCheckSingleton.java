package com.singleton;

/**
 * 双重检查实现单例模式
 */
public class DoubleCheckSingleton {
    //静态对象
    private static DoubleCheckSingleton singleton;

    //私有化构造函数,防止外部实例化
    private DoubleCheckSingleton(){}

    //实例化对象
    public static DoubleCheckSingleton getInstall(){
        if(singleton==null){//为空才去同步实例化对象，对比同步方法的方式，这里避免了实例化后的也被同步
            synchronized (DoubleCheckSingleton.class){
                if (singleton==null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return  singleton;
    }
}
