package ��;
//import java.util.Scanner;

public class ���̻���{
	 
	 int water = 10; // ������ ��
	 int snack = 20; // ��
	 int can = 30; // ��ġĵ
	 int toenail = 10; // ��ī�ο� ����
	 int teeth = 20; // ��ī�ο� ��
	 int look = 10; // ��ȭ���� ����� ����
	 int pink =20; // ��ũ����
	 
	 public void choice() throws InterruptedException {
		 System.out.println("");
		 Thread.sleep(1000);
		 System.out.println("���� ������ �����Ͽ����ϴ�.\n");
		 
		 Thread.sleep(1000);
		 System.out.println("������ �����Ͻ÷��� 1���� �Ǹ��Ͻ÷��� 2���� �������ּ���.");
		 System.out.println("(0���� ������ �ڷ� ���ϴ�.)\n");
		 
	 }
	 
	 public int show_booty(int leg, int tail, int scales) {
		 System.out.println("");
		 System.out.println("����������������������������������������������������������������������������������");
		 System.out.println("");
		 
		 int sum = leg+tail+scales;
		 if(sum==0) {
			 System.out.println("	    ������ ����ǰ�� �����ϴ�.");
			 System.out.println("	    ����� ���� ����ǰ�� ȹ���ϼ���");
			 System.out.println("");
			 System.out.println("����������������������������������������������������������������������������������");
			 System.out.println("");
		 }
		 if(sum!=0) {
			 if(leg!=0) {
				 System.out.println("      1. ���������� �ٸ�");
				 System.out.println("                     ���� : 10��");
				 System.out.println("                     ���� : "+ leg);
				 System.out.println("");
			 }
			 if(tail!=0) {
				 System.out.println("      2. ���� ����");
				 System.out.println("                     ���� : 15��");
				 System.out.println("                     ���� : "+ tail);
				 System.out.println("");
			 }
			 if(scales!=0) {
				 System.out.println("      3. ���� ���");
				 System.out.println("                     ���� : 20��");
				 System.out.println("                     ���� : "+ scales);
				 System.out.println("");
			 }
			 System.out.println("����������������������������������������������������������������������������������");
			 System.out.println("");
			 System.out.print("�Ǹ��� ����ǰ�� ��ȣ�� �Է��ϼ��� (0. ���ư���) : ");
			 System.out.println("");
		 }
		 return sum;
	 }
	 
	 
	 public void show() { // �޴� �����ֱ�
		 
		 	System.out.println("");
		    System.out.println("���������������������������� HP ����������������������������");
		    System.out.println("");
		    System.out.println("       1. ������ ��(10��) ");
		    System.out.println("       2. ���ִ� ��(20��) ");
		    System.out.println("       3. ������ ��ġĵ(30��) ");
		    System.out.println("");
		    System.out.println("���������������������������� �Ŀ�  ����������������������������");
		    System.out.println("");
		    System.out.println("       4. ��ī�ο� ����(10��)");
		    System.out.println("       5. ��ī�ο� ��(20��)");
		    System.out.println("");
		    System.out.println("�������������������������� ����  ����������������������������");
		    System.out.println("");
		    System.out.println("       6. ��ȭ���� ����� ����(10��)");
		    System.out.println("       7. ��ũ���� (20��)");
		    System.out.println("");
		    System.out.println("��������������������������������������������������������������������");
		    System.out.print("���Ͻô� ������ ��ȣ�� �Է��ϼ��� (0. ���ư���) : ");
		    System.out.println("");
	 }
	 
	 
	 public int purchase(int money, int number) // ����Ʈ ���
	 {
	  System.out.println("���� �������� ������ ���� �õ��ϴ� ���Դϴ�.");
	  if(number == 1)
	  {
	   // �� ���ݺ��� ���� �� ���� ��
	   if(water <= money)
	    return money - water;
	  }
	  if(number == 2)
	  {
	   // �� ���ݺ��� ���� �� ���� ��
	   if(snack <= money)
	    return money - snack;
	  }
	  if(number == 3)
	  {
	   // ��ġĵ ���ݺ��� ���� �� ���� ��
	   if(can <= money)
	    return money - can;
	  }
	  if(number == 4)
	  {
	   // ��ī�ο� ���� ���ݺ��� ���� �� ���� ��
	   if(toenail <= money)
	    return money - toenail;
	  }
	  if(number == 5)
	  {
	   // ��ī�ο� �̺��� ���� �� ���� ��
	   if(teeth <= money)
	    return money - teeth;
	  }
	  if(number == 6)
	  {
	   // ��ȭ���� ����� �������� ���� �� ���� ��
	   if(teeth <= money)
	    return money - teeth;
	  }
	  if(number == 7)
	  {
	   // ��ũ�������� ���� �� ���� ��
	   if(teeth <= money)
	    return money - teeth;
	  }
	  	// ���� ������ ��
	  	return -1;
	 }
}


