package Main;

import ĳ����.�����;
import ĳ����.����;

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
                	System.out.println("���ѽð� 10�ʰ� �������ϴ�.\n");
					System.out.println("��ɿ� �����߽��ϴ�.(0�� ���� �޴��� ���ư�����)\n");
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
		//System.out.println("                  "+n+"�� ���");
		return n;
	}
    
}