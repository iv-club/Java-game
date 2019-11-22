package 맵;

import Main.Music;

public class 인벤토리 {
	
	public int inventory_show(int[] cnt) { //인벤토리 보여주기
		int sum=0;
		   for(int i=0; i<7;i++) {
			   sum+=cnt[i];
		   }
		   System.out.println("");
		   
		   System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		   System.out.println("");
		   
		   if(sum==0) {
			   System.out.println("	    보유한 물품이 없습니다.");
			   System.out.println("	    냥이 상점에 가서 물품을 구매하세요");
			   System.out.println("");
			   System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			   System.out.println("");
		   }
		   else {
			   if(cnt[0]>0) {
				   System.out.println("      1. 깨끗한 물");
				   System.out.println("                     기능 : hp를 10 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[0]);
				   System.out.println("");
			   }
			   if(cnt[1]>0) {
				   System.out.println("      2. 맛있는 츄르");
				   System.out.println("                     기능 : hp를 20 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[1]);
				   System.out.println("");
			   }
			   if(cnt[2]>0) {
				   System.out.println("      3. 영롱한 참치캔");
				   System.out.println("                     기능 : hp를 30 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[2]);
				   System.out.println("");
			   }
			   if(cnt[3]>0) {
				   System.out.println("      4. 날카로운 발톱");
				   System.out.println("                     기능 : 파워를 10 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[3]);
				   System.out.println("");
			   }
			   if(cnt[4]>0) {
				   System.out.println("      5. 날카로운 이");
				   System.out.println("                     기능 : 파워를 20 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[4]);
				   System.out.println("");
			   }
			   if(cnt[5]>0) {
				   System.out.println("      6. 장화신은 고양이 눈빛");
				   System.out.println("                     기능 : 방어력을 10 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[5]);
				   System.out.println("");
			   }
			   if(cnt[6]>0) {
				   System.out.println("      7. 핑크젤리");
				   System.out.println("                     기능 : 방어력을 20 증가시킵니다.");
				   System.out.println("                     갯수 : "+ cnt[6]);
				   System.out.println("");
			   }
			   
			   System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			   System.out.println("");
		   }
		   return sum;
	}
	
	public int inventory_use_hp(int number, int[] cnt, int hp) throws InterruptedException {//아이템 사용(hp)
		
		   if(number==1) {
			   System.out.println("");
			   System.out.println("[ 깨끗한 물 ] 을 사용하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("hp를 10 증가시킵니다.\n\n\n\n\n\n\n\n");
			   Music acheive1 = new Music("acheive.mp3",false);  // 버튼 클릭
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
			   System.out.println("[ 맛있는 츄르 ] 를 사용하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("hp를 20 증가시킵니다.\n\n\n\n\n\n\n\n");
			   Music acheive2 = new Music("acheive.mp3",false);  // 버튼 클릭
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
			   System.out.println("[ 영롱한 참치캔 ] 을 사용하였습니다.\n");
			   Thread.sleep(1000);
			   System.out.println("hp를 30 증가시킵니다.\n\n\n\n\n\n\n\n");
			   Music acheive3 = new Music("acheive.mp3",false);  // 버튼 클릭
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
	
	public int inventory_use_power(int number, int[] cnt, int power) throws InterruptedException { // 아이템 사용(체력)
		
		if(number==4) {
			System.out.println("");
			System.out.println("[ 날카로운 발톱 ] 를 사용하였습니다.\n");
			Thread.sleep(1000);
			System.out.println("파워를 10 증가시킵니다.\n\n\n\n\n\n\n\n");
			Music acheive4 = new Music("acheive.mp3",false);  // 버튼 클릭
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
		   System.out.println("[ 날카로운 이 ] 를 사용하였습니다.\n");
		   Thread.sleep(1000);
		   System.out.println("파워를 20 증가시킵니다.\n\n\n\n\n\n\n\n\n");
		   Music acheive5 = new Music("acheive.mp3",false);  // 버튼 클릭
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
	
	public int inventory_use_defense(int number, int[] cnt, int defense) throws InterruptedException { // 아이템 사용(체력)
		
		if(number==6) {
			System.out.println("");
		   System.out.println("[ 장화신은 고양이 눈빛 ] 를 사용하였습니다.\n");
		   Thread.sleep(1000);
		   System.out.println("방어력을 10 증가시킵니다.\n\n\n\n\n\n\n\n");
		   Music acheive6 = new Music("acheive.mp3",false);  // 버튼 클릭
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
		   System.out.println("[ 핑크젤리 ] 를 사용하였습니다.\n");
		   Thread.sleep(1000);
		   System.out.println("방어력을 20 증가시킵니다.\n\n\n\n\n\n\n\n");
		   Music acheive7 = new Music("acheive.mp3",false);  // 버튼 클릭
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
