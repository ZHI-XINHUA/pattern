package com.zxh.observer;

public class PoliceObserver implements Observer {
	private String informantLocation;//���˵�λ��

	@Override
	public void update(Subject subject) {
		//��ȡ����λ��
		informantLocation = ((InformantSubject)subject).getLocation();

	}

	public String getInformantLocation() {
		return informantLocation;
	}

	public void setInformantLocation(String informantLocation) {
		this.informantLocation = informantLocation;
	}
	
	

}
