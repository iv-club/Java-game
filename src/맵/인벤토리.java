package ��;

import Main.Music;

public class �κ��丮 {
	
	public int inventory_show(int[] cnt) { //�κ��丮 �����ֱ�
		int sum=0;
		   for(int i=0; i<7;i++) {
			   sum+=cnt[i];
		   }
		   System.out.println("");
		   
		   System.out.println("����������������������������������������������������������������������������������");
		   System.out.println("");
		   
		   if(sum==0) {
			   System.out.println("	    ������ ��ǰ�� �����ϴ�.");
			   System.out.println("	    ���� ������ ���� ��ǰ�� �����ϼ���");
			   System.out.println("");
			   System.out.println("����������������������������������������������������������������������������������");
			   System.out.println("");
		   }
		   else {
			   if(cnt[0]>0) {
				   System.out.println("      1. ������ ��");
				   System.out.println("                     ��� : hp�� 10 ������ŵ�ϴ�.");
				   System.out.println("                     ���� : "+ cnt[0]);
				   System.out.println("");
			   }
			   if(cnt[1]>0) {
				   System.out.println("      2. ���ִ� ��");
				   System.out.println("                     ��� : hp�� 20 ������ŵ�ϴ�.");
				   System.out.println("                     ���� : "+ cnt[1]);
				   System.out.println("");
			   }
			   if(cnt[2]>0) {
				   System.out.println("      3. ������ ��ġĵ");
				   System.out.println("                     ��� : hp�� 30 ������ŵ�ϴ�.");
				   System.out.println("                     ���� : "+ cnt[2]);
				   System.out.println("");
			   }
			   if(cnt[3]>0) {
				   System.out.println("      4. ��ī�ο� ����");
				   System.out.println("                     ��� : �Ŀ��� 10 ������ŵ�ϴ�.");
				   System.out.println("                     ���� : "+ cnt[3]);
				   System.out.println("");
			   }
			   if(cnt[4]>0) {
				   System.out.println("      5. ��ī�ο� ��");
				   System.out.println("                     ��� : �Ŀ��� 20 ������ŵ�ϴ�.");
				   System.out.println("                     ���� : "+ cnt[4]);
				   System.out.println("");
			   }
			   if(cnt[5]>0) {
				   System.out.println("      6. ��ȭ���� ����� ����");
				   System.out.println("                     ��� : ������ 10 ������ŵ�ϴ�.");
				   System.out.println("                     ���� : "+ cnt[5]);
				   System.out.println("");
			   }
			   if(cnt[6]>0) {
				   System.out.println("      7. ��ũ����");
				   System.out.println("                     ��� : ������ 20 ������ŵ�ϴ�.");
				   System.out.println("                     ���� : "+ cnt[6]);
				   System.out.println("");
			   }
			   
			   System.out.println("����������������������������������������������������������������������������������");
			   System.out.println("");
		   }
		   return sum;
	}
	
	public int inventory_use_hp(int number, int[] cnt, int hp) throws InterruptedException {//������ ���(hp)
		
		   if(number==1) {
			   System.out.println("");
			   System.out.println("[ ������ �� ] �� ����Ͽ����ϴ�.\n");
			   Thread.sleep(1000);
			   System.out.println("hp�� 10 ������ŵ�ϴ�.\n\n\n\n\n\n\n\n");
			   Music acheive1 = new Music("acheive.mp3",false);  // ��ư Ŭ��
			   acheive1.start();
			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			   cnt[0]-=1;
			   hp += 10;
		   }
		   else if(number==2) {
			   System.out.println("");
			   System.out.println("[ ���ִ� �� ] �� ����Ͽ����ϴ�.\n");
			   Thread.sleep(1000);
			   System.out.println("hp�� 20 ������ŵ�ϴ�.\n\n\n\n\n\n\n\n");
			   Music acheive2 = new Music("acheive.mp3",false);  // ��ư Ŭ��
			   acheive2.start();
			   Thread.sleep(2000);
			   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			   cnt[1]-=1;
			   hp += 20;
		   }
		   else if(number==3) {
			   System.out.println("");
			   System.out.println("[ ������ ��ġĵ ] �� ����Ͽ����ϴ�.\n");
			   Thread.sleep(1000);
			   System.out.println("hp�� 30 ������ŵ�ϴ�.\n\n\n\n\n\n\n\n");
			   Music acheive3 = new Music("acheive.mp3",false);  // ��ư Ŭ��
			    acheive3.start();
			    Thread.sleep(2000);
			    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			   cnt[2]-=1;
			   hp += 30;
		   }
		return hp;
		   
	}
	
	public int inventory_use_power(int number, int[] cnt, int power) throws InterruptedException { // ������ ���(ü��)
		
		if(number==4) {
			System.out.println("");
			System.out.println("[ ��ī�ο� ���� ] �� ����Ͽ����ϴ�.\n");
			Thread.sleep(1000);
			System.out.println("�Ŀ��� 10 ������ŵ�ϴ�.\n\n\n\n\n\n\n\n");
			Music acheive4 = new Music("acheive.mp3",false);  // ��ư Ŭ��
		    acheive4.start();
		    Thread.sleep(2000);
		    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			cnt[3]-=1;
			power += 10;
	   }
	   else if(number==5) {
		   System.out.println("");
		   System.out.println("[ ��ī�ο� �� ] �� ����Ͽ����ϴ�.\n");
		   Thread.sleep(1000);
		   System.out.println("�Ŀ��� 20 ������ŵ�ϴ�.\n\n\n\n\n\n\n\n\n");
		   Music acheive5 = new Music("acheive.mp3",false);  // ��ư Ŭ��
		   acheive5.start();
		   Thread.sleep(2000);
		   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		   cnt[4]-=1;
		   power += 20;
	   }
		return power;
	}
	
	public int inventory_use_defense(int number, int[] cnt, int defense) throws InterruptedException { // ������ ���(ü��)
		
		if(number==6) {
			System.out.println("");
		   System.out.println("[ ��ȭ���� ����� ���� ] �� ����Ͽ����ϴ�.\n");
		   Thread.sleep(1000);
		   System.out.println("������ 10 ������ŵ�ϴ�.\n\n\n\n\n\n\n\n");
		   Music acheive6 = new Music("acheive.mp3",false);  // ��ư Ŭ��
		    acheive6.start();
		    Thread.sleep(2000);
		    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		   cnt[3]-=1;
		   defense += 10;
	   }
	   else if(number==7) {
		   System.out.println("");
		   System.out.println("[ ��ũ���� ] �� ����Ͽ����ϴ�.\n");
		   Thread.sleep(1000);
		   System.out.println("������ 20 ������ŵ�ϴ�.\n\n\n\n\n\n\n\n");
		   Music acheive7 = new Music("acheive.mp3",false);  // ��ư Ŭ��
		   acheive7.start();
		   Thread.sleep(2000);
		   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		   cnt[4]-=1;
		   defense += 20;
	   }
		return defense;
	}

}
