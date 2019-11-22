package ��;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Main.Music;
import �׸�.�׸�;
import �׸�.����;

public class fishgame2 extends JFrame implements ActionListener, Runnable{

	ImageIcon ii = new ImageIcon("fish1.png");//�̹��������� ����
	private JButton box[] = new JButton[12]; //���� ����� ��ư�� �迭�� ��������(��ư12��)
	private JButton start = new JButton("����");
	private JLabel jlb = new JLabel("���� : 0");
	private JLabel time_jlb = new JLabel("�ð� => 0:10");
	private BorderLayout bl = new BorderLayout(10,10);
	private JPanel jp1 = new JPanel();
	private GridLayout gl1 = new GridLayout(3,4);// 3*4
	private JPanel jp2 = new JPanel();
	private GridLayout gl2 = new GridLayout(1,2);
	private JPanel jp21 = new JPanel();
	private FlowLayout fl21 = new FlowLayout(FlowLayout.RIGHT);

	private int random_num = 0;// ������
	private int count = -1;// ����
	private int a = 1;

	public fishgame2(String title){// ������ : ���� ���� ����Ǵ� �κ�
		super(title);// Ÿ��Ʋ�� 
		this.init();// Ÿ��Ʋ�� 
		this.start();
		// ������� â ����
		super.setSize(800,800);//�˾��Ǵ� â�� ũ�� ����
		super.setLocation(500, 150);//����ͻ� ǥ�õǴ� ��ġ
		super.setVisible(true); // â�� �����ٰ�����
		this.setAlwaysOnTop(true);

	}

	public void init(){//��ư ��ġ ����
		Container con = this.getContentPane();
		con.setLayout(bl);
		con.add("North", time_jlb);
		con.add("Center", jp1);
		jp1.setLayout(gl1); //GridLayout

		for(int i=0; i<12; ++i){
			box[i] = new JButton(); //��ư����
			jp1.add(box[i]);	//jp1�ǳڿ� box[i] �߰�
		}

		off_button();//��Ȱ�� ��ư ȣ��
		con.add("South", jp2);
		jp2.setLayout(gl2);
		jp2.add(jlb);
		jp2.add(jp21);
		jp21.setLayout(fl21);
		jp21.add(start);

	}

	public void start(){

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X��ư Ŭ���� ����
		start.addActionListener(this);
		for(int i=0; i<12; ++i){// ��ư �̺�Ʈ ����
			box[i].addActionListener(this);
		}

	} 



	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == start){
			time_jlb.setText("�ð� => 0:10");
			jlb.setText("���� : 0");
			count=-1;
			Thread th = new Thread(this);
			th.start();
			on_button();
			random(0);

		}

		for(int i=0; i<12; ++i){
			if (e.getSource() == box[i]){
				random(i);
			}
		}

	}

	public void off_button(){//��ư ��Ȱ��ȭ 
		for(int i=0; i<12; ++i){
			box[i].setEnabled(false);
		}

	} 

	public void on_button(){//��ư Ȱ��ȭ
		for(int i=0; i<12; ++i){
			box[i].setEnabled(true);
		}
	} 

	public void run(){// �� ����
		int time = 10;
		���� message= new ����();
		

		while(true){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}

			time--;
			if (a==0) {
				break;
			}
			if (time == 0) {
				time_jlb.setText("���ѽð��� �ʰ��߽��ϴ�.");
				off_button();
				try{
					Thread.sleep(500);
					dispose();
					System.out.println("");
					System.out.println("���ѽð��� �ʰ��߽��ϴ�.");
					System.out.println("");
					System.out.println("");
					
					Music failed1 = new Music("failed.mp3",false);  // ��ư Ŭ��
					failed1.start();
					
					System.out.println("�̼� �����Դϴ�.\n");
					Thread.sleep(1000);
					message.show_fail();
					Thread.sleep(1000);
					System.out.println("");
					System.out.println("�絵���� ���� ���� �̼��� �����ϼ���\n");
				}catch(InterruptedException e){}
				break;
			}
			time_jlb.setText("�ð� => 0:0"+time);
		}
	} 



	public void random(int i){
		
		���� message= new ����();
		�׸� fish = new �׸�();
		
		if (i != random_num) {// �������� Ŭ������ ���� ������ ����
			off_button();// �߸� Ŭ���ϸ� ��ư ����
			try{
				Thread.sleep(1000);//0.5�� �����ٰ�
				dispose(); // �ڵ� â����
				a=0;
				System.out.println("");
				Music failed1 = new Music("failed.mp3",false);  // ��ư Ŭ��
				failed1.start();
				System.out.println("�����Դϴ�.");
				message.show_fail();
				System.out.println("�絵���� ���� ���� �̼��� �����ϼ���");
			}catch(InterruptedException e){}
			return;
		}
		
		count++;// ���� ���̱�
		box[random_num].setIcon(null); // ����� �̹��� �����
		random_num = (int)(Math.random() * 12);//���� �� ����
		box[random_num].setIcon(ii); // �ڽ� ������ ��ġ�� �̹��� ���� ����
		jlb.setText("���� : " + count);
		
		if(count==10) {// 10�� ������ ����
			try {
				dispose();
				System.out.println("");
				Music success = new Music("success.mp3",false);  // ��ư Ŭ��
				success.start();
				System.out.println("���� �̼� �����Դϴ�!!\n");
				Thread.sleep(1000);
				System.out.println("������ ȹ���Ͽ����ϴ�.\n");
				fish.show_fish();
				Thread.sleep(1000);
				System.out.println("");
				System.out.println("�ڽĳ��̵鿡�� ������ ������ ����Ͽ����ϴ�.\n");
				System.out.println("");
				Thread.sleep(1000);
				message.show_HAPPY();
				System.exit(0);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}

	}

} 
