package 캐릭터;

import Main.Music;

public class 바퀴벌레 extends 몬스터{
	
//	public 바퀴벌레() {
//		booty = "바퀴벌레의 다리";
//		name = "바퀴벌레";
//		hp = 300;
//		level = 1;
//		power = 20;
//		defense = 5;
//		money = 10;
//		experience = 20;
//	}
	
	public int attack() {
		
		Music punch = new Music("punch.mp3",false);  // 버튼 클릭
		punch.start();
	    
		System.out.println("");
		System.out.println("                                               [ 바퀴벌레  ] 의 공격입니다."); 
		System.out.println("                                               [ 간지럽게 하기 ] 를 사용하였습니다");
		System.out.println("                                                                                       파워는 " + power + "입니다.\n");
		//System.out.println("");
		
		return power;
	}
}
