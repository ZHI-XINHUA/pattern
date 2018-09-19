package com.zxh.observer;

public class PoliceObserver implements Observer {
	private String informantLocation;//线人的位置

	@Override
	public void update(Subject subject) {
		//获取线人位置
		informantLocation = ((InformantSubject)subject).getLocation();

	}

	public String getInformantLocation() {
		return informantLocation;
	}

	public void setInformantLocation(String informantLocation) {
		this.informantLocation = informantLocation;
	}



}