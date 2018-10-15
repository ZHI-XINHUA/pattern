package com.singleton;

/**
 * 枚举类实现单例模式
 *   优点：天然线程安全、单例；而且避免了反射和反序列化漏洞
 *   不足：不支持懒加载
 */
public enum EnumSingleton {

    //这个是枚举元素，本身就是单例对象
    SINGLETON;

    public void operate(){
        System.out.println("EnumSingleton test");
    }
}
