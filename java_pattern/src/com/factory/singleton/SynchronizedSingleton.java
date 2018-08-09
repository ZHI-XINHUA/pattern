package com.factory.singleton;

/**
 * 利用同步实例化对象，解决并发情况下单例的对象创建
 *  更极致的追求：同步方法会使一个线程访问时挂起其它所有线程，会造成很多无谓的等待。（同步方法会使实例化创建后也同步控制，这是没有必要的）
 *   解决这问题要定位到出现并发的语句，明细是在实例化对象new SynchronizedSingleton()中出现并发问题，所以优化要从同步粒度控制
 *
 */
public class SynchronizedSingleton {
    //静态实例变量
    private static SynchronizedSingleton singleton;

    //私有化构造函数,防止外部实例化
    private SynchronizedSingleton(){}

    //实例化对象
    public synchronized static SynchronizedSingleton getInstace(){
        if(singleton==null){
            singleton = new SynchronizedSingleton();
        }
        return  singleton;
    }
}
