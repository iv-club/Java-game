package ĳ����;

import Main.Music;

public class �� extends ����{
	
//	public ��() {
//		booty = "���� ����";
//		name = "��";
//		hp = 500;
//		level = 2;
//		power = 60;
//		defense = 15;
//		money = 30;
//		experience = 30;
//	}
	public int attack() {
		Music punch = new Music("punch.mp3",false);  // ��ư Ŭ��
		punch.start();
		System.out.println("");
		System.out.println("                                               [ ��  ] �� �����Դϴ�."); 
		System.out.println("                                               [ ������ ] �� ����Ͽ����ϴ�");
		System.out.println("                                                                                       �Ŀ��� " + power + "�Դϴ�.\n");
		System.out.println("");
		
		return power;
	}

}
