package 맵;
//import java.util.Scanner;

public class 냥이상점{
	 
	 int water = 10; // 깨끗한 뭏
	 int snack = 20; // 츄르
	 int can = 30; // 참치캔
	 int toenail = 10; // 날카로운 발톱
	 int teeth = 20; // 날카로운 이
	 int look = 10; // 장화신은 고양이 눈빛
	 int pink =20; // 핑크젤리
	 
	 public void choice() throws InterruptedException {
		 System.out.println("");
		 Thread.sleep(1000);
		 System.out.println("냥이 상점에 입장하였습니다.\n");
		 
		 Thread.sleep(1000);
		 System.out.println("물건을 구매하시려면 1번을 판매하시려면 2번을 선택해주세요.");
		 System.out.println("(0번을 누르면 뒤로 갑니다.)\n");
		 
	 }
	 
	 public int show_booty(int leg, int tail, int scales) {
		 System.out.println("");
		 System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		 System.out.println("");
		 
		 int sum = leg+tail+scales;
		 if(sum==0) {
			 System.out.println("	    보유한 전리품이 없습니다.");
			 System.out.println("	    사냥을 통해 전리품을 획득하세요");
			 System.out.println("");
			 System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			 System.out.println("");
		 }
		 if(sum!=0) {
			 if(leg!=0) {
				 System.out.println("      1. 바퀴벌레의 다리");
				 System.out.println("                     가격 : 10원");
				 System.out.println("                     갯수 : "+ leg);
				 System.out.println("");
			 }
			 if(tail!=0) {
				 System.out.println("      2. 쥐의 꼬리");
				 System.out.println("                     가격 : 15원");
				 System.out.println("                     갯수 : "+ tail);
				 System.out.println("");
			 }
			 if(scales!=0) {
				 System.out.println("      3. 뱀의 비늘");
				 System.out.println("                     가격 : 20원");
				 System.out.println("                     갯수 : "+ scales);
				 System.out.println("");
			 }
			 System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			 System.out.println("");
			 System.out.print("판매할 전리품의 번호를 입력하세요 (0. 돌아가기) : ");
			 System.out.println("");
		 }
		 return sum;
	 }
	 
	 
	 public void show() { // 메뉴 보여주기
		 
		 	System.out.println("");
		    System.out.println("━━━━━━━━━━━━━━ HP ━━━━━━━━━━━━━━");
		    System.out.println("");
		    System.out.println("       1. 깨끗한 물(10원) ");
		    System.out.println("       2. 맛있는 츄르(20원) ");
		    System.out.println("       3. 영롱한 참치캔(30원) ");
		    System.out.println("");
		    System.out.println("━━━━━━━━━━━━━━ 파워  ━━━━━━━━━━━━━━");
		    System.out.println("");
		    System.out.println("       4. 날카로운 발톱(10원)");
		    System.out.println("       5. 날카로운 이(20원)");
		    System.out.println("");
		    System.out.println("━━━━━━━━━━━━━ 방어력  ━━━━━━━━━━━━━━");
		    System.out.println("");
		    System.out.println("       6. 장화신은 고양이 눈빛(10원)");
		    System.out.println("       7. 핑크젤리 (20원)");
		    System.out.println("");
		    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		    System.out.print("원하시는 물건을 번호를 입력하세요 (0. 돌아가기) : ");
		    System.out.println("");
	 }
	 
	 
	 public int purchase(int money, int number) // 포인트 계산
	 {
	  System.out.println("냥이 상점에서 물건을 구매 시도하는 중입니다.");
	  if(number == 1)
	  {
	   // 물 가격보다 돈이 더 많을 때
	   if(water <= money)
	    return money - water;
	  }
	  if(number == 2)
	  {
	   // 츄르 가격보다 돈이 더 많을 때
	   if(snack <= money)
	    return money - snack;
	  }
	  if(number == 3)
	  {
	   // 참치캔 가격보다 돈이 더 많을 때
	   if(can <= money)
	    return money - can;
	  }
	  if(number == 4)
	  {
	   // 날카로운 발톱 가격보다 돈이 더 많을 때
	   if(toenail <= money)
	    return money - toenail;
	  }
	  if(number == 5)
	  {
	   // 날카로운 이보다 돈이 더 많을 때
	   if(teeth <= money)
	    return money - teeth;
	  }
	  if(number == 6)
	  {
	   // 장화신은 고양이 눈빛보다 돈이 더 많을 때
	   if(teeth <= money)
	    return money - teeth;
	  }
	  if(number == 7)
	  {
	   // 핑크젤리보다 돈이 더 많을 때
	   if(teeth <= money)
	    return money - teeth;
	  }
	  	// 돈이 부족할 때
	  	return -1;
	 }
}


