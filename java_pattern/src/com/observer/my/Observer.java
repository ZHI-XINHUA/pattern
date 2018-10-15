package com.observer.my;

/**
 * Created by xh.zhi on 2018-9-20.
 *  观察者接口：提供一个统一的观察者做出相应行为的方法
 */
public interface Observer {
    //获取观察目标（被观察对象）发送变化的信息
    void update(Observable observable);
}
