package com.observer.my;


/**
 * Created by xh.zhi on 2018-9-19.
 * 抽象主题角色：抽取管理观察者对象，如：登记、删除、通知观察者
 */
public interface Subject {
    /**
     * 登记一个新的观察者对象
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除一个观察者对象
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知所有登记的观察者对象
     */
    void notifyObservers();
}
