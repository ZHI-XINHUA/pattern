package com.zxh.observer;

/**
* ���۲����
 */
public class InformantSubject extends Subject {
	private String location;//λ��

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
		this.notifyAllObservers();//���۲����λ�÷��͸ı䣬����֪ͨ�۲���
	}
	
	
}
