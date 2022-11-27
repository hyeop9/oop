import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class FuncGUI_2 extends JFrame{

	JButton prime, digitSum, reset;
	JTextField tf;

	FuncGUI_2() {
		super("Test Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		UpPannel jpUp = new UpPannel();
		c.add(jpUp);

		setLocation(200, 300);
		setSize(500, 200);
		setVisible(true);
	}

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

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == prime) {
				tf.setText("N 이하의 소수 찾기");
				findPrime();
			}
			else if (e.getSource() == digitSum) {
				tf.setText("자연수 N의 각 자리값의 합 구하기");
				digitSum();
			}
			else if (e.getSource() == reset) {
				tf.setText("");
			}
		}
	}

	public boolean is_prime(int num) {
		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void findPrime() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("N이하의 소수찾기, 양의 정수를 입력하시오 : ");
		int nMAX = scanner.nextInt();

		Vector<Integer> prime = new Vector<Integer>();

		for (int x = 2; x <= nMAX; x++) {
			if (is_prime(x) == true) {
				prime.add(x);
			}
		}
		System.out.printf("\n%d이하의 소수는 %d개이고 다음과 같습니다\n\n", nMAX, prime.size());

		for (int x = 0; x < prime.size(); x++) {
			System.out.printf("%4d ", prime.get(x));
			if ((x + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n");
		tf.setText(String.format("\n%d이하의 소수는 %d개 입니다\n", nMAX, prime.size()));
	}

	public void digitSum() {
		int cnt = 0, i, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("자연수 N의 각 자리값의 합, 정수를 입력하시오 ");
		String num_str = scanner.nextLine();

		for (i = 0; i < num_str.length(); i++) {
			String s = num_str.substring(i, i + 1);
			try {
				sum += Integer.parseInt(s);
				System.out.print(s + " ");
			} catch (NumberFormatException e) {
				cnt--;
			}
			cnt++;
		}
		System.out.println("");
		System.out.printf("입력한 숫자의 자리수는 %d 이고 합은 %d 입니다\n\n", cnt, sum);
		tf.setText(String.format("%s의 자리수는 %d 이고 합은 %d 입니다\n\n", num_str, cnt, sum));
	}
	public static void main(String[] args) {
		new FuncGUI_2();
	}
}
