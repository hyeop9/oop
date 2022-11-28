import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class CalcExGUI_3 extends JFrame{

	CalcExGUI_3() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(null);

		JTextField tf1 = new JTextField("");
		tf1.setSize(440, 50);
		tf1.setLocation(20, 20);
		tf1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tf1.setHorizontalAlignment(SwingConstants.CENTER);

		JTextField tf2 = new JTextField(" RESULT ");
		tf2.setSize(440, 50);
		tf2.setLocation(20, 180);
		tf2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tf2.setHorizontalAlignment(SwingConstants.CENTER);

		JButton bt = new JButton(" = ");
		bt.setFont(new Font("맑은 고딕", 0, 20));
		bt.setSize(100, 50);
		bt.setLocation(100, 100);

		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int i, num;
				double result = 0, sum = 0;

				Vector<Integer> v = new Vector<Integer>();
				Vector<String> op = new Vector<String>();

				String exp0 = tf1.getText();

				System.out.println("[1] 숫자 벡터 저장");
				StringTokenizer st = new StringTokenizer(exp0, "+-*/");

				while (st.hasMoreTokens()) {
					String s = st.nextToken();
					s = s.trim();
					System.out.println("  현재 분리된 string : " + s);

					num = Integer.parseInt(s);
					v.add(num);
				}

				System.out.println("[2] 연산자 벡터 저장");
				st = new StringTokenizer(exp0, "0123456789");

				while (st.hasMoreTokens()) {
					String s = st.nextToken();
					s = s.trim();
					System.out.println("  현재 분리된 string : " + s);
					op.add(s);
				}

				System.out.printf("\n입력한 계산식은 %s ", v.get(0));
				for (i = 0; i < op.size(); i++) {
					String s = op.get(i);
					int n = v.get(i + 1);
					System.out.print(s + " " + n + " ");
				}
				System.out.println("입니다");

				sum = v.get(0);
				for (i = 1; i < v.size(); i++) {
					String s = op.get(i - 1);
					int n = v.get(i);

					if (s.compareTo("+") == 0) {
						sum += n;
					} else if (s.compareTo("-") == 0) {
						sum -= n;
					}
				}
				System.out.println("입력한 계산식의 결과는 " + sum + "입니다");
				result = sum;

				tf2.setText(Double.toString(result));
			}
		});

		JButton bt2 = new JButton("CANCEL");
		bt2.setFont(new Font("맑은 고딕", 0, 16));
		bt2.setSize(100, 50);
		bt2.setLocation(280, 100);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				tf1.setText("");
				tf2.setText(" RESULT ");
			}
		});

		cp.add(tf1);
		cp.add(tf2);
		cp.add(bt);
		cp.add(bt2);
		System.out.print(bt.getBackground());
		cp.setBackground(new Color(230, 240, 250));

		setLocation(300, 300);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		CalcExGUI_3 cac1 = new CalcExGUI_3();
	}
}
