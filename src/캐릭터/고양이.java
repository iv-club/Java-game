package ĳ����;

import java.util.Random;
import java.util.Scanner;

import Main.Music;
import �׸�.����;

public class ����� extends ĳ����{
	 
	 public int fish=0;

	 public void show() {
			System.out.println("");
			System.out.println("����������������������������������������������������������������������������������");
			System.out.println("��                                       ��");
			System.out.println(" 	            �̸�    : " + name);
			System.out.println(" 	       hp  : " + hp);
			System.out.println(" 	    level  : " + level);
			System.out.println(" 	            �Ŀ�    : " + power);
			System.out.println(" 	         ����    : " + defense);
			System.out.println(" 	         ����ġ    : " + experience);
			System.out.println(" 	               ��    : " + money + " ��");
			System.out.println(" 	     ���� ����    : " + fish);
			System.out.println("��                                       ��");
			System.out.println("����������������������������������������������������������������������������������");
			System.out.println("");
	}
	public void show_fight() {
			System.out.println("");
			System.out.println("����������������������������������������������������������������������������������");
			System.out.println(" 	       hp  : " + hp);
			System.out.println(" 	    level  : " + level);
			System.out.println(" 	         ����ġ    : " + experience);
			System.out.println(" 	               ��    : " + money + " ��");
			System.out.println("����������������������������������������������������������������������������������");
			System.out.println("");
	}
	 
	 public int beg() throws InterruptedException {
			Scanner scanner = new Scanner(System.in);
			Random ran = new Random();
			����  text = new ����();
			System.out.println("\n\n\n\n\n\n\n\n");
			System.out.println("������������������������������������ �����ϱ�  ����������������������������������������\n"); 
			System.out.println("           3���� �� �� �Ѱ��� ���� ������\n");
			System.out.println("       ���� ����� ���� ���ִ� ������ �԰� hp�� ȸ���� �� ���ְ�\n");
			System.out.println("           ���� ����� ���� ���� �¾� hp�� ������ ���� �ְ�\n ");
			System.out.println("         �氡�� ���ϳ��̸� ���� �ο��� �Ͼ�� �ֽ��ϴ�.\n");
			System.out.println("������������������������������������������������������������������������������������������");
			System.out.println("��ȣ�� �Է��ϼ��� : ");
			int number = scanner.nextInt();
			
			int remember=0;
			int random = ran.nextInt(3);
			if(random==0) {
				Thread.sleep(1000);
				System.out.println("\n\n\n\n\n\n\n\n");
				text.show_con();
				System.out.println("");
				Music success = new Music("success.mp3",false);  // ��ư Ŭ��
				success.start();
				Thread.sleep(1000);
				System.out.println("���ϵ帳�ϴ�\n");
				Thread.sleep(1000);
				System.out.println("���� ����� �������ϴ�!\n");
				Thread.sleep(1000);
				System.out.println("��ġĵ�� �԰� hp�� 20 ȸ���մϴ�\n");
				Music acheive1 = new Music("acheive.mp3",false);  // ��ư Ŭ��
			    acheive1.start();
			    
				Thread.sleep(2000);
				System.out.println("");
				remember=1;
			}
			if(random==1) {
				Thread.sleep(1000);
				System.out.println("\n\n\n\n\n\n\n\n");
				text.show_sad();
				System.out.println("");
				Music failed1 = new Music("failed.mp3",false);  // ��ư Ŭ��
				failed1.start();
				Thread.sleep(1000);
				System.out.println("��Ÿ���׿�\n");
				Thread.sleep(1000);
				System.out.println("���� ����� �������ϴ�!\n");
				Thread.sleep(1000);
				System.out.println("���� �°� hp�� -10 �����մϴ�\n");
				Music acheive2 = new Music("acheive.mp3",false);  // ��ư Ŭ��
			    acheive2.start();
				Thread.sleep(2000);
				System.out.println("");
				remember=2;
			}
			if(random==2) {
				Thread.sleep(1000);
				System.out.println("\n\n\n\n\n\n\n\n");
				text.show_sad();
				System.out.println("");
				Music failed2 = new Music("failed.mp3",false);  // ��ư Ŭ��
				failed2.start();
				Thread.sleep(1000);
				System.out.println("��Ÿ���׿�\n");
				Thread.sleep(1000);
				System.out.println("�氡�� ���ϳ��̸� �������ϴ�!\n");
				Thread.sleep(1000);
				System.out.println("���ϳ��̿� �ο��� �� hp�� -15 �����մϴ�.\n");
				Music acheive3 = new Music("acheive.mp3",false);  // ��ư Ŭ��
			    acheive3.start();
				Thread.sleep(2000);
				remember=3;
			}
			return remember;
		}
}
