package 캐릭터;

import Main.Music;

public class 쥐 extends 몬스터{
	
//	public 쥐() {
//		booty = "쥐의 꼬리";
//		name = "쥐";
//		hp = 500;
//		level = 2;
//		power = 60;
//		defense = 15;
//		money = 30;
//		experience = 30;
//	}
	public int attack() {
		Music punch = new Music("punch.mp3",false);  // 버튼 클릭
		punch.start();
		System.out.println("");
		System.out.println("                                               [ 쥐  ] 의 공격입니다."); 
		System.out.println("                                               [ 깨물기 ] 를 사용하였습니다");
		System.out.println("                                                                                       파워는 " + power + "입니다.\n");
		System.out.println("");
		
		return power;
	}

}
