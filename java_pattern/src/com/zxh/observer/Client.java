package com.zxh.observer;

public class Client {

	public static void main(String[] args) {
		//目标对象 （线人）
		InformantSubject subject = new InformantSubject();
		
		//创建多个观察者
		PoliceObserver p1 = new PoliceObserver();
		PoliceObserver p2 = new PoliceObserver();
		PoliceObserver p3 = new PoliceObserver();
		
		//添加到观察组
		subject.addObserver(p1);
		subject.addObserver(p2);
		subject.addObserver(p3);
		
		//线人活动了
		System.out.println("########## #############");
		subject.setLocation("钵兰街");
		System.out.println("team one 获得线人位置："+p1.getInformantLocation());
		System.out.println("team two  获得线人位置："+p2.getInformantLocation());
		System.out.println("team three 获得线人位置："+p3.getInformantLocation());
		System.out.println("########## #############");
		
		subject.setLocation("尖沙咀");
		System.out.println("team one 获得线人位置："+p1.getInformantLocation());
		System.out.println("team two  获得线人位置："+p2.getInformantLocation());
		System.out.println("team three 获得线人位置："+p3.getInformantLocation());
		System.out.println("########## #############");
	}

}
