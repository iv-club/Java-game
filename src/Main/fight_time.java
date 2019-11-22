package Main;

import 캐릭터.고양이;
import 캐릭터.몬스터;

public class fight_time extends Thread{
	
	private int n=0;
	private boolean stop; 
	
	fight_time(){
		this.stop = false;
	}
	
	@Override
    public void run(){
        
        while(!stop){
            
            try{
            	n++;
            	time();
            	
                sleep(1000);
                
                if(n==10) {
                	System.out.println("");
                	System.out.println("제한시간 10초가 지났습니다.\n");
					System.out.println("사냥에 실패했습니다.(0을 눌러 메뉴로 돌아가세요)\n");
					stop=true;
                	break;
                }
            }
            catch(Exception e){
                return;
            }
        }
    }
	
	public void threadStop(boolean stop){
		this.stop = stop;
	}
    
	public int time() {
		// TODO Auto-generated method stub
		//System.out.println("");
		//System.out.println("                  "+n+"초 경과");
		return n;
	}
    
}