package Main;
import java.awt.*;
import javax.swing.*;

class ThreadTimerEx extends JFrame{
    JLabel la;
    JLabel la1;
    JLabel la2;
    int min, sec;
    int day=1;
    
    ThreadTimerEx(){
        this.setTitle("�Ϸ� 2��");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        MyThread th = new MyThread();
        la=new JLabel();
        la1=new JLabel();
        la2=new JLabel();
        
        la.setFont(new Font("Gothic", Font.PLAIN, 50));
        
        la1.setFont(new Font("Gothic", Font.ITALIC, 20));
        la1.setOpaque(true);// �� ����
        Color color = new Color(255,0,0);
        la1.setForeground(color);
        
        la2.setFont(new Font("Gothic", Font.ITALIC, 20));
        
        this.add("Center",la);
        this.add("North",la1);
        this.add("West",la2);
        
        this.setLocationRelativeTo(null);
        this.setSize(400,200);
        this.setVisible(true);
        this.setAlwaysOnTop(true); // ������ �׻� ���� �ְ�
        th.start();
    }
    
    public int time() {
    	return min;
    }
    
    public int day() {
    	return day;
    }
    
    
    class MyThread extends Thread{
        public void run(){
            int n=0;

            while(true){
            	n++;
            	sec  = n % 60;
                min  = n / 60 % 60;
                
                if(min==0) {
                	la1.setText(String.format(" ��  �� - �������� ��ð��Դϴ�."));
                }
                if(min==1) {
                	la1.setText(String.format(" �� �� - �������԰� ���� �ݾҽ��ϴ�. "));
                }
                if(min==2) {
                	n=0;
                	day++;
                }
                la2.setText(String.format("        " + day +" ����"));
                //la.setText(Integer.toString(n++));
            	la.setText(String.format("  %02d:%02d", min, sec));
                try{
                    sleep(1000);
                }
                catch(Exception e){
                    return;
                }
            }
        }
    }
}
