import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.*;

public class FuncGUI_3 extends JFrame {
	JButton prime, digitSum, reset;
	JTextField tf;
	JTextArea ta;

	String mode;
	int num;
	int nMax;

	FuncGUI_3() {
		super("Test Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		UpPannel jpUp = new UpPannel();
		DownPannel jpDown = new DownPannel();
		CenterPannel jpCenter = new CenterPannel();

		c.add(jpUp, BorderLayout.NORTH);
		c.add(jpCenter);
		c.add(jpDown, BorderLayout.SOUTH);

		setLocation(1200,300);
		setSize(500, 500);
		setVisible(true);		
	}

	class UpPannel extends JPanel{
		
		UpPannel(){						
			setLayout(new GridLayout(2,1,5,5));	
			MyActionListener listener = new MyActionListener();

			prime = new JButton("Prime Number");
			prime.setFont(new Font("맑은 고딕", 0, 20));
			prime.addActionListener(listener);

			digitSum = new JButton("DigitSum");
			digitSum.setFont(new Font("맑은 고딕", 0, 20));

			JPanel jp = new JPanel();
			jp.setLayout(new GridLayout(1, 2, 10, 10));
			jp.add(prime);
			jp.add(digitSum);

			tf = new JTextField("", 20);
			tf.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			tf.addActionListener(listener);

			add(jp);
			add(tf);											
		}			
	}
	
	class CenterPannel extends JPanel{  		// TextArea 출력
		
		CenterPannel(){
			setBackground(Color.WHITE);
			setLayout(new BorderLayout());
			ta = new JTextArea("", 20, 60);
			ta.setFont(new Font("돋움", Font.BOLD, 15));				
			add(new JScrollPane(ta));
		}		
	}
	
	class DownPannel extends JPanel{			// Reset 버튼
		
		DownPannel(){		
			reset = new JButton("Reset");
			reset.setFont(new Font("맑은 고딕", 0, 20));	
			MyActionListener listener = new MyActionListener();
			reset.addActionListener(listener);			
			add(reset);
		}			
	}	
	
	class MyActionListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {					
					
			if(e.getSource() == prime) {
				ta.setText("");
				tf.setText(" N이하의 소수찾기, 양의 정수를 입력하시오 : ");
				mode = "prime";
			}
			else if(e.getSource() == digitSum) {
				ta.setText("");
				tf.setText(" 정수의 자리값의 합, 양의 정수를 입력하시오 : ");
				mode = "digitSum";
			}
			else if(e.getSource() == reset) {
				ta.setText("");
				tf.setText("");
			}			
			else if(e.getSource() == tf) {
//				JTextField t = (JTextField)e.getSource();
				if (mode.compareTo("prime")==0) {						
					String str = tf.getText();						
					System.out.println(str);

					int ind = str.indexOf(":");
					System.out.println(ind + str.substring(ind + 1));

					int nMax = Integer.parseInt(str.substring(ind + 2));
					findPrime(nMax);
				}
				if (mode.compareTo("digitSum")==0) {						
					String str = tf.getText();						
					System.out.println(str);

					int ind = str.indexOf(":");
					System.out.println(ind + " " + str.substring(ind + 2));
					digitSum(str.substring(ind + 2));
				}
			}
		}		
	}
	
	public boolean is_prime(int num) {
		
		for(int i=2; i<=(int)Math.sqrt(num); i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}	

	public void findPrime(int nMax) {
		
		Vector<Integer> prime = new Vector<Integer>();
		
		for(int x=2; x<nMax; x++)	
			if (is_prime(x) == true)
				prime.add(x);
					  
		String s = String.format("%d이하의 소수는 %d개이고 다음과 같습니다\n\n", nMax, prime.size());		
		ta.append(s);
			
		s = "";
		for (int x=0; x < prime.size(); x++) {
			s = s + String.format("%04d  ", prime.get(x));
			if ((x + 1) % 10 == 0) {
				s += "\n";
				ta.append(s);
				s = "";
			}
		}			
		s = s + "\n";					
		ta.append(s);
	}
	
	public void digitSum(String num_str) {
		
		int cnt = 0, i, sum=0, digit;		
		String s, tmp;
		i = 0;
		while(i<num_str.length()) {
			s = num_str.substring(i, i + 4);
			try {
				digit = Integer.parseInt(s);
				sum += digit;
				tmp = String.format("   digt = %d ----> digitSum = %d\n", digit, sum);
				ta.append(tmp);
				cnt++;
			} catch (NumberFormatException e) {}
			i++;
		}		
		tmp = "\n";
		ta.append(tmp);
		tmp = String.format(" 입력한 숫자의 자리수는 %d 이고 합은 %d 입니다\n", cnt, sum);
		ta.append(tmp);	
	}
	
	public static void main(String[] args) {
		new FuncGUI_3();
	}
}






