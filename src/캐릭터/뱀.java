package ĳ����;

import Main.Music;

public class ��  extends ����{

//	public ��() {
//		booty = "���� ���";
//		name = "��";
//		hp = 800;
//		level = 3;
//		power = 100;
//		defense = 25;
//		money = 50;
//		experience = 50;
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
