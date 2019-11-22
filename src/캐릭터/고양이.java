package 캐릭터;

import java.util.Random;
import java.util.Scanner;

import Main.Music;
import 그림.글자;

public class 고양이 extends 캐릭터{
	 
	 public int fish=0;

	 public void show() {
			System.out.println("");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                                       ┃");
			System.out.println(" 	            이름    : " + name);
			System.out.println(" 	       hp  : " + hp);
			System.out.println(" 	    level  : " + level);
			System.out.println(" 	            파워    : " + power);
			System.out.println(" 	         방어력    : " + defense);
			System.out.println(" 	         경험치    : " + experience);
			System.out.println(" 	               돈    : " + money + " 원");
			System.out.println(" 	     보유 생선    : " + fish);
			System.out.println("┃                                       ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("");
	}
	public void show_fight() {
			System.out.println("");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println(" 	       hp  : " + hp);
			System.out.println(" 	    level  : " + level);
			System.out.println(" 	         경험치    : " + experience);
			System.out.println(" 	               돈    : " + money + " 원");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("");
	}
	 
	 public int beg() throws InterruptedException {
			Scanner scanner = new Scanner(System.in);
			Random ran = new Random();
			글자  text = new 글자();
			System.out.println("\n\n\n\n\n\n\n\n");
			System.out.println("┏━━━━━━━━━━━━━━━━━ 구걸하기  ━━━━━━━━━━━━━━━━━━━┓\n"); 
			System.out.println("           3가지 길 중 한가지 길을 고르세요\n");
			System.out.println("       착한 사람을 만나 맛있는 간식을 먹고 hp를 회복할 수 도있고\n");
			System.out.println("           나쁜 사람을 만나 돌을 맞아 hp가 감소할 수도 있고\n ");
			System.out.println("         길가던 도둑냥이를 만나 싸움이 일어날수 있습니다.\n");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println("번호를 입력하세요 : ");
			int number = scanner.nextInt();
			
			int remember=0;
			int random = ran.nextInt(3);
			if(random==0) {
				Thread.sleep(1000);
				System.out.println("\n\n\n\n\n\n\n\n");
				text.show_con();
				System.out.println("");
				Music success = new Music("success.mp3",false);  // 버튼 클릭
				success.start();
				Thread.sleep(1000);
				System.out.println("축하드립니다\n");
				Thread.sleep(1000);
				System.out.println("착한 사람을 만났습니다!\n");
				Thread.sleep(1000);
				System.out.println("참치캔을 먹고 hp를 20 회복합니다\n");
				Music acheive1 = new Music("acheive.mp3",false);  // 버튼 클릭
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
				Music failed1 = new Music("failed.mp3",false);  // 버튼 클릭
				failed1.start();
				Thread.sleep(1000);
				System.out.println("안타깝네요\n");
				Thread.sleep(1000);
				System.out.println("나쁜 사람을 만났습니다!\n");
				Thread.sleep(1000);
				System.out.println("돌을 맞고 hp가 -10 감소합니다\n");
				Music acheive2 = new Music("acheive.mp3",false);  // 버튼 클릭
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
				Music failed2 = new Music("failed.mp3",false);  // 버튼 클릭
				failed2.start();
				Thread.sleep(1000);
				System.out.println("안타깝네요\n");
				Thread.sleep(1000);
				System.out.println("길가던 도둑냥이를 만났습니다!\n");
				Thread.sleep(1000);
				System.out.println("도둑냥이와 싸움을 해 hp가 -15 감소합니다.\n");
				Music acheive3 = new Music("acheive.mp3",false);  // 버튼 클릭
			    acheive3.start();
				Thread.sleep(2000);
				remember=3;
			}
			return remember;
		}
}
