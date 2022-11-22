import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class FuncGUI_1 extends JFrame{

	JButton prime, digitSum, reset;
	JTextField tf;

	class UpPannel extends JPanel {
		UpPannel() {
			setLayout(new GridLayout(3, 1, 5, 5));
			MyActionListener listener = new MyActionListener();

			prime = new JButton("Prime Number");
			prime.setFont(new Font("맑은 고딕", 0, 20));
			prime.addActionListener(listener);

			digitSum = new JButton("DigitSum");
			digitSum.setFont(new Font("맑은 고딕", 0, 20));
			digitSum.addActionListener(listener);

			reset = new JButton("   Reset   ");
			reset.setFont(new Font("맑은 고딕", 0, 20));
			reset.addActionListener(listener);

			tf = new JTextField("", 20);
			tf.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			tf.setHorizontalAlignment(SwingConstants.CENTER);

			JPanel jp1 = new JPanel();
			jp1.setLayout(new GridLayout(1, 2, 10, 10));
			jp1.add(prime);
			jp1.add(digitSum);

			JPanel jp3 = new JPanel();
			jp3.add(reset);

			add(jp1);
			add(tf);
			add(jp3);
		}
	}

	FuncGUI_1() {
		super("Test Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		UpPannel jpUp = new UpPannel();
		c.add(jpUp);

		setLocation(200, 300);
		setSize(500, 200);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == prime) {
				tf.setText("N 이하의 소수 찾기");
			}
			else if (e.getSource() == digitSum) {
				tf.setText("자연수 N의 각 자리값의 합 구하기");
			}
			else if (e.getSource() == reset) {
				tf.setText("");
			}
		}
	}

	public static void main(String[] args) {
		new FuncGUI_1();
	}
}
