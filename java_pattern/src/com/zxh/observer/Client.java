package com.zxh.observer;

public class Client {

	public static void main(String[] args) {
		//Ŀ����� �����ˣ�
		InformantSubject subject = new InformantSubject();
		
		//��������۲���
		PoliceObserver p1 = new PoliceObserver();
		PoliceObserver p2 = new PoliceObserver();
		PoliceObserver p3 = new PoliceObserver();
		
		//��ӵ��۲���
		subject.addObserver(p1);
		subject.addObserver(p2);
		subject.addObserver(p3);
		
		//���˻��
		System.out.println("########## #############");
		subject.setLocation("������");
		System.out.println("team one �������λ�ã�"+p1.getInformantLocation());
		System.out.println("team two  �������λ�ã�"+p2.getInformantLocation());
		System.out.println("team three �������λ�ã�"+p3.getInformantLocation());
		System.out.println("########## #############");
		
		subject.setLocation("��ɳ��");
		System.out.println("team one �������λ�ã�"+p1.getInformantLocation());
		System.out.println("team two  �������λ�ã�"+p2.getInformantLocation());
		System.out.println("team three �������λ�ã�"+p3.getInformantLocation());
		System.out.println("########## #############");
	}

}
