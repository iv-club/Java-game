package ĳ����;
import java.util.Scanner;

import Main.*;
import �׸�.*;
public class ���� extends ĳ����{
	 
	 public String booty;
	 private boolean stop; 
	 Scanner scanner = new Scanner(System.in);
	 �׸� picture = new �׸�();
	
	 int count=0;
	 int time_count=0;
	 ���� text = new ����();
	 
	 public ����(){
			this.stop = false;
		}
		
		@Override
	    public void run(){
			while(!stop){
	            try{
	            	int monster_attack = attack();
//	            	if(name == "��") {
//	            		picture.show_sn();
//	            	}
	            	int a;
	            	if(����.cat.defense>=monster_attack)
	            		a = 0;
	            	else
	            		 a = ����.cat.defense -monster_attack;
	            	
	            	����.cat.attacked(monster_attack);
	            	//System.out.println("�� ������ : "+a);
	            	
	            	
	            	if(����.cat.hp<0) {
	            		stop=true;
	            		����.fight_time.threadStop(true);
	            		Music failed1 = new Music("failed.mp3",false);  // ��ư Ŭ��
				    	failed1.start();
				    	System.out.println("������̰� �׾����ϴ�...��\n\n");
				    	text.show_end();
				    	Thread.sleep(2000);
				    	System.exit(0);
	            	}
	            	System.out.println("                                                                                       ������� �ܿ� hp : " + ����.cat.hp);
	            	System.out.println("                                                                                       ������ �ܿ� hp : " + hp);
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
