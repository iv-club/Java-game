package 캐릭터;

import java.util.Scanner;

import Main.Music;

public class 검은고양이  extends 고양이{
	
//	public 검은고양이() {
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
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("         1. 깨물기");
		System.out.println("         2. 하악질하기                   ");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
		
		System.out.print("공격 번호를 입력하세요 : ");
		int number = scanner.nextInt();
		
		int sum=0;
		
		 if(number == 1)
		 {
			 sum+= power*10;
			 System.out.println("");
			 Music cat = new Music("cat_voice.mp3",false);  // 버튼 클릭
		      cat.start();
			 System.out.println("[ 깨물기 ] 를 사용하였습니다.");
			 System.out.println("파워는 " + sum + "입니다.");
			 System.out.println("");
			 return sum;
		 }
		 if(number == 2)
		 {
			 sum+= power*5;
			 System.out.println("");
			 Music cat1 = new Music("cat_voice.mp3",false);  // 버튼 클릭
		      cat1.start();
			 System.out.println("[ 하악질하기 ] 를 사용하였습니다.");
			 System.out.println("파워는 " + sum + "입니다.");
			 System.out.println("");
			 return sum;
		 }
		 return sum;
	}
}
