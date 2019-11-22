package 맵;
import 캐릭터.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import 그림.*;

public class fishgame extends JFrame implements ActionListener{
// 제한 시간 없는거	
	ImageIcon icon = new ImageIcon("fish1.png"); // 이미지아이콘 생성
	private JButton box[] = new JButton[12]; // 같은 모양의 버튼을 배열로 만듬(버튼12개)
	private GridLayout gl = new GridLayout(3,4); // 3*4 
	private JPanel jp1 = new JPanel();
	
	private int random_num = 0; // 랜덤수
	private int count = 0;// 점수
	
	고양이 cat1 = new 고양이();
	
	public fishgame(String title){ // 생성자 가장 먼저 실행되는 부분
		super(title); // 타이틀바 
		this.init(); // 타이틀바 
		super.setSize(800,800);//팝업되는 창의 크기 조절
		super.setLocation(300, 100);//모니터상에 표시되는 위치
		super.setVisible(true); // 창을 보여줄것인지
		this.start();
	}
	
	public void init(){//초기화
		Container con = this.getContentPane();
		con.add("Center", jp1);
		jp1.setLayout(gl); //GridLayout
		
		for(int i=0; i<12; ++i){
			box[i] = new JButton(); // 버튼생성
			jp1.add(box[i]);	//jp1판넬에 box[i] 추가
		}
	}
	
	public void start(){

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X버튼 클릭시 종료
		for(int i=0; i<12; ++i){ // 버튼 이벤트 생성
			box[i].addActionListener(this);
		}
	}
	
	public void off_button(){//버튼 비활성화 
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
		
		글자 message= new 글자();
		
		if (i != random_num) { // 랜덤수와 클릭값이 같지 않으면 다시 
			dispose();
			//off_button(); // 잘못 클릭하면 버튼 오프 미션 실패
			System.out.println("");
			System.out.println("실패입니다.");
			message.show_fail();
			System.out.println("재도전을 통해 최종 미션을 수행하세요");
			return count;
		}
		count++; // 점수 높이기
		box[random_num].setIcon(null); // 맞춘거 이미지 지우기
		random_num = (int)(Math.random() * 12); //랜덤 수 생성
		box[random_num].setIcon(icon); //박스 랜덤값 위치에 이미지 새로 띄우기
		
		
		if(count==11) { // 10점 넘으면 성공
			System.out.println("");
			System.out.println("최종 미션 성공입니다!!");
			System.out.println("생선을 획득하였습니다.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("자식냥이들에게 무사히 생선을 배달하였습니다.");
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

