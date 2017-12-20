package com.zxh.observer_jdk;

import java.util.Observable;
import java.util.Observer;

public class PoliceObserver implements Observer {

	private String informantLocation;//线人的位置
	
	@Override
	public void update(Observable observable, Object message) {
		String location = ((InformantSubject)observable).getLocation();
		informantLocation = message+"【"+location+"】";

	}

	public String getInformantLocation() {
		return informantLocation;
	}

	public void setInformantLocation(String informantLocation) {
		this.informantLocation = informantLocation;
	}

	
}
