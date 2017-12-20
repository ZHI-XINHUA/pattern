package com.zxh.observer;

import java.util.ArrayList;
import java.util.List;

/*
* �۲��߹۲��Ŀ�꣨���Ǳ��۲����ĸ��ࣩ
*/
public class Subject {
	//������й۲���
	protected List<Observer> list = new ArrayList<Observer>();
	
	//��ӹ۲���
	public void addObserver(Observer observer){
		list.add(observer);
	}
	
	//�Ƴ��۲���
	public void removeObserver(Observer observer){
		list.remove(observer);
	}
	
	//֪ͨ���й۲���
	public void notifyAllObservers(){
		for(Observer observer:list){
			observer.update(this);
		}
	}
}
