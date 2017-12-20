package com.zxh.observer_jdk;

import java.util.Observable;

public class InformantSubject extends Observable {
	private String location;//位置

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
		setChanged();  //表示目标对象已经做了更改
		this.notifyObservers("我现在的位置");;//被观察对象位置发送改变，马上通知观察者
	}
}
