package com.zxh.observer_jdk;

import java.util.Observable;

public class InformantSubject extends Observable {
	private String location;//λ��

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
		setChanged();  //��ʾĿ������Ѿ����˸���
		this.notifyObservers("�����ڵ�λ��");;//���۲����λ�÷��͸ı䣬����֪ͨ�۲���
	}
}
