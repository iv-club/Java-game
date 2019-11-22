package 캐릭터;
import java.util.Scanner;

import Main.*;
import 그림.*;
public class 몬스터 extends 캐릭터{
	 
	 public String booty;
	 private boolean stop; 
	 Scanner scanner = new Scanner(System.in);
	 그림 picture = new 그림();
	
	 int count=0;
	 int time_count=0;
	 글자 text = new 글자();
	 
	 public 몬스터(){
			this.stop = false;
		}
		
		@Override
	    public void run(){
			while(!stop){
	            try{
	            	int monster_attack = attack();
//	            	if(name == "뱀") {
//	            		picture.show_sn();
//	            	}
	            	int a;
	            	if(메인.cat.defense>=monster_attack)
	            		a = 0;
	            	else
	            		 a = 메인.cat.defense -monster_attack;
	            	
	            	메인.cat.attacked(monster_attack);
	            	//System.out.println("실 데미지 : "+a);
	            	
	            	
	            	if(메인.cat.hp<0) {
	            		stop=true;
	            		메인.fight_time.threadStop(true);
	            		Music failed1 = new Music("failed.mp3",false);  // 버튼 클릭
				    	failed1.start();
				    	System.out.println("가장냥이가 죽었습니다...ㅠ\n\n");
				    	text.show_end();
				    	Thread.sleep(2000);
				    	System.exit(0);
	            	}
	            	System.out.println("                                                                                       고양이의 잔여 hp : " + 메인.cat.hp);
	            	System.out.println("                                                                                       몬스터의 잔여 hp : " + hp);
	                count++;  
	                time_count++;
	            	sleep(2000);
	            	if(time_count==5) {
	            		stop=true;
	            	}
	            	
	            	
	            }
	            catch(Exception e){
	                return;
	            }
	        }
		}
		
		public void Stop(boolean stop){
			this.stop = stop;
		}
		
		public int count() {
			return count;
		}
}
