package ��;
import ĳ����.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import �׸�.*;

public class fishgame extends JFrame implements ActionListener{
// ���� �ð� ���°�	
	ImageIcon icon = new ImageIcon("fish1.png"); // �̹��������� ����
	private JButton box[] = new JButton[12]; // ���� ����� ��ư�� �迭�� ����(��ư12��)
	private GridLayout gl = new GridLayout(3,4); // 3*4 
	private JPanel jp1 = new JPanel();
	
	private int random_num = 0; // ������
	private int count = 0;// ����
	
	����� cat1 = new �����();
	
	public fishgame(String title){ // ������ ���� ���� ����Ǵ� �κ�
		super(title); // Ÿ��Ʋ�� 
		this.init(); // Ÿ��Ʋ�� 
		super.setSize(800,800);//�˾��Ǵ� â�� ũ�� ����
		super.setLocation(300, 100);//����ͻ� ǥ�õǴ� ��ġ
		super.setVisible(true); // â�� �����ٰ�����
		this.start();
	}
	
	public void init(){//�ʱ�ȭ
		Container con = this.getContentPane();
		con.add("Center", jp1);
		jp1.setLayout(gl); //GridLayout
		
		for(int i=0; i<12; ++i){
			box[i] = new JButton(); // ��ư����
			jp1.add(box[i]);	//jp1�ǳڿ� box[i] �߰�
		}
	}
	
	public void start(){

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X��ư Ŭ���� ����
		for(int i=0; i<12; ++i){ // ��ư �̺�Ʈ ����
			box[i].addActionListener(this);
		}
	}
	
	public void off_button(){//��ư ��Ȱ��ȭ 
		for(int i=0; i<12; ++i){
			box[i].setEnabled(false);
		}

	} 
	
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0; i<12; ++i){
			if (e.getSource() == box[i]){
				random(i,0);
			}
		}
	}
	public int random(int i, int fish){
		
		���� message= new ����();
		
		if (i != random_num) { // �������� Ŭ������ ���� ������ �ٽ� 
			dispose();
			//off_button(); // �߸� Ŭ���ϸ� ��ư ���� �̼� ����
			System.out.println("");
			System.out.println("�����Դϴ�.");
			message.show_fail();
			System.out.println("�絵���� ���� ���� �̼��� �����ϼ���");
			return count;
		}
		count++; // ���� ���̱�
		box[random_num].setIcon(null); // ����� �̹��� �����
		random_num = (int)(Math.random() * 12); //���� �� ����
		box[random_num].setIcon(icon); //�ڽ� ������ ��ġ�� �̹��� ���� ����
		
		
		if(count==11) { // 10�� ������ ����
			System.out.println("");
			System.out.println("���� �̼� �����Դϴ�!!");
			System.out.println("������ ȹ���Ͽ����ϴ�.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("�ڽĳ��̵鿡�� ������ ������ ����Ͽ����ϴ�.");
			System.out.println("");
			message.show_HAPPY();
			System.exit(0);
			//System.out.println(count); 11
			dispose();
			return count;
		}
		return count;
	}
	
}

