package com.zxh.observer;

/**
* 观察者接口
 */
public interface Observer {
	//获取观察目标（被观察对象）发送变化的信息
	void update(Subject subject);
}
