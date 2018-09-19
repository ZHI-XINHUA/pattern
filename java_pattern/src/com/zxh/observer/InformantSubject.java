package com.zxh.observer;

/**
 * 被观察对象
 */
public class InformantSubject extends Subject {
	private String location;//位置

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
		this.notifyAllObservers();//被观察对象位置发送改变，马上通知观察者
	}


}
