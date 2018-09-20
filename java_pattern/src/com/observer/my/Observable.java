package com.observer.my;

import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by xh.zhi on 2018-9-20.
 * 被观察者父类角色：管理观察者（登记、删除、发送通知观察者）
 */
public class Observable {
    /**存放所有登记的观察者**/
    Vector<Observer> vector = new Vector<Observer>();

    /**
     * 登记观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        vector.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void deleteObserver(Observer observer){
        vector.remove(observer);
    }

    /**
     * 发送通知给观察者
     */
    public void notifyObservers(){
        ListIterator<Observer> list = vector.listIterator();
        while(list.hasNext()){
            Observer observer = list.next();
            observer.update(this);
        }
    }
}
