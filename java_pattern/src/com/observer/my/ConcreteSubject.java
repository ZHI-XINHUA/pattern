package com.observer.my;

import java.util.Vector;

/**
 * Created by xh.zhi on 2018-9-19.
 */
public class ConcreteSubject implements Subject {

    /**存放登记的观察者对象**/
    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void attach(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {

    }
}
