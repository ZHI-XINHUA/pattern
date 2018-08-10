package com.singleton;

/**
 * 饿汉式单例模式
 * 优点：静态属性只会在第一次加载类时初始化；此种方式避免了多线程带来的问题，而且也避免了双重检查jvm调优的问题。
 * 缺点：一旦我访问了Singleton的任何其他的静态域，就会造成实例的初始化，而事实是可能我们从始至终就没有使用这个实例，造成内存的浪费
 *
 * 总结：这种缺点对于99%的项目是基本没什么影响的。 加载配置文件也是使用这种方式居多。
 */
public class HungrySingleton {
    //静态实例化对象
    private static  HungrySingleton singleton = new HungrySingleton();

    //私有化构造函数,防止外部实例化
    private HungrySingleton(){};

    public static HungrySingleton getInstace(){
        return singleton;
    }
}
