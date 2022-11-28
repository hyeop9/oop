import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; 

public class Lotto_GUI_Null1 extends JFrame {
	
	public Lotto_GUI_Null1() {
		super("로또 추첨 게임"); // 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// CenterPanel을 프레임의 CENTER 영역에 부착한다.
		Container contentPane = getContentPane();				
		contentPane.add(new CenterPanel(), BorderLayout.CENTER); 
		
		setSize(1125,710);
		setVisible(true);		
	}
	
 class CenterPanel extends JPanel { 		
	 
     CenterPanel() {

		int i, k = 1, m = 1;		
		setLayout(null); // 배치관리자 삭제, 절대 위치에 컴포넌트 삽입		
		
		int W3 = 1070/3+1, H3 = 100;
		
		JTextField tf1;
				
		JTextField tf2;
		
		JTextField tf3;
		
		JButton bt3;
		
		JButton bt4;
		
		int W = 100, H = 100;
		int Hgap=10, Vgap=10, xind = 1, yind = 1;
		
		int xPos=0, yPos=0;		

		for(i=1; i<=45; i++){
			
			String text = Integer.toString(i);
			JButton bt = new JButton(text); 			// 문자열을 버튼 객체로 생성
			bt.setSize(W, H);						
			bt.setFont(new Font("맑은 고딕", Font.BOLD, 20));		
			
			xPos = (xind-1)*W + Hgap*xind;  // 버튼의 x 좌표
			yPos = (yind-1)*H + Vgap*yind;  // 버튼의 y 좌표
			
			bt.setLocation(xPos, yPos); 	// 위치 지정
			
			if(i%10 == 0){
				yind++;
				xind = 1; 	}			
			else{
				xind++;	}
			add(bt);
		}
		
     }
}		
	
	static public void main(String[] arg) {
		new Lotto_GUI_Null1();
	}
}
