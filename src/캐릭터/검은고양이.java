package ĳ����;

import java.util.Scanner;

import Main.Music;

public class ���������  extends �����{
	
//	public ���������() {
//		hp = 200;
//		level = 1;
//		power = 15;
//		defense = 20;
//		money = 0;
//		experience = 0;
//		
//	}
	
	public int attack() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������������������������������������������������������");
		System.out.println("         1. ������");
		System.out.println("         2. �Ͼ����ϱ�                   ");
		System.out.println("������������������������������������������������������������\n");
		
		System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
		int number = scanner.nextInt();
		
		int sum=0;
		
		 if(number == 1)
		 {
			 sum+= power*10;
			 System.out.println("");
			 Music cat = new Music("cat_voice.mp3",false);  // ��ư Ŭ��
		      cat.start();
			 System.out.println("[ ������ ] �� ����Ͽ����ϴ�.");
			 System.out.println("�Ŀ��� " + sum + "�Դϴ�.");
			 System.out.println("");
			 return sum;
		 }
		 if(number == 2)
		 {
			 sum+= power*5;
			 System.out.println("");
			 Music cat1 = new Music("cat_voice.mp3",false);  // ��ư Ŭ��
		      cat1.start();
			 System.out.println("[ �Ͼ����ϱ� ] �� ����Ͽ����ϴ�.");
			 System.out.println("�Ŀ��� " + sum + "�Դϴ�.");
			 System.out.println("");
			 return sum;
		 }
		 return sum;
	}
}
