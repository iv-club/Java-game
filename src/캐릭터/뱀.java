package 캐릭터;

import Main.Music;

public class 뱀  extends 몬스터{

//	public 뱀() {
//		booty = "뱀의 비늘";
//		name = "뱀";
//		hp = 800;
//		level = 3;
//		power = 100;
//		defense = 25;
//		money = 50;
//		experience = 50;
//	}
	
	public int attack() {
	     
		Music punch = new Music("punch.mp3",false);  // 버튼 클릭
		punch.start();
		System.out.println("");
		System.out.println("                                               [ 뱀  ] 의 공격입니다."); 
		System.out.println("                                               [ 조르기 ] 를 사용하였습니다");
		System.out.println("                                                                                       파워는 " + power + "입니다.\n");
		System.out.println("");
		
		return power;
	}
}
