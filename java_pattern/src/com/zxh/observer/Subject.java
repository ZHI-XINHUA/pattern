package com.zxh.observer;

import java.util.ArrayList;
import java.util.List;

/*
* 观察者观察的目标（即是被观察对象的父类）
*/
public class Subject {
	//存放所有观察者
	protected List<Observer> list = new ArrayList<Observer>();
	
	//添加观察者
	public void addObserver(Observer observer){
		list.add(observer);
	}
	
	//移除观察者
	public void removeObserver(Observer observer){
		list.remove(observer);
	}
	
	//通知所有观察者
	public void notifyAllObservers(){
		for(Observer observer:list){
			observer.update(this);
		}
	}
}
