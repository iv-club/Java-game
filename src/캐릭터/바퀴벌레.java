package ĳ����;

import Main.Music;

public class �������� extends ����{
	
//	public ��������() {
//		booty = "���������� �ٸ�";
//		name = "��������";
//		hp = 300;
//		level = 1;
//		power = 20;
//		defense = 5;
//		money = 10;
//		experience = 20;
//	}
	
	public int attack() {
		
		Music punch = new Music("punch.mp3",false);  // ��ư Ŭ��
		punch.start();
	    
		System.out.println("");
		System.out.println("                                               [ ��������  ] �� �����Դϴ�."); 
		System.out.println("                                               [ �������� �ϱ� ] �� ����Ͽ����ϴ�");
		System.out.println("                                                                                       �Ŀ��� " + power + "�Դϴ�.\n");
		//System.out.println("");
		
		return power;
	}
}
