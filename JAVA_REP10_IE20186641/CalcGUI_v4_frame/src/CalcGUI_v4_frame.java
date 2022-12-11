import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class CalcGUI_v4_frame extends JFrame{

	JTextField input;
	JTextField output;
	JButton bt1;
	JButton bt2;

	CalcGUI_v4_frame() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();

		Font Font20 = new Font("맑은 고딕", Font.BOLD, 20);
		Font Font30 = new Font("맑은 고딕", Font.BOLD, 30);

		input = new JTextField("");
		input.setFont(Font30);
		input.setHorizontalAlignment(SwingConstants.CENTER);
		input.setBackground(new Color(235, 235, 235));
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				String str = t.getText();
				double result = calculation(str);
				output.setText(Double.toString(result));
			}
		});

		output = new JTextField(" RESULT ");
		output.setFont(Font30);
		output.setHorizontalAlignment(SwingConstants.CENTER);

		bt1 = new JButton(" = ");
		bt1.setFont(Font30);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = t.getText();
				double result = calculation(str);
				output.setText(Double.toString(result));
			}
		});

		bt2 = new JButton("CANCEL");
		bt2.setFont(new Font("맑은 고딕", 0, 16));
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				input.setText("");
				output.setText(" RESULT ");
			}
		});

		JPanel CPn = new JPanel(new GridLayout(4, 4, 5, 5));
		for (int i = 0; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setFont(Font30);
			CPn.add(b);
		}

		JButton b1 = new JButton("?");
		CPn.add(b1, 3);
		JButton b2 = new JButton("?");
		CPn.add(b2, 7);
		JButton b3 = new JButton("?");
		CPn.add(b3, 11);
		CPn.add(bt1);
		CPn.add(bt2);
		JButton b4 = new JButton("?");
		CPn.add(b4);

		JPanel DPn = new JPanel(new BorderLayout());
		DPn.add(output);

		cp.add(UPn, BorderLayout.NORTH);
		cp.add(CPn);
		cp.add(DPn, BorderLayout.SOUTH);

		cp.setBackground(new Color(230, 240, 250));
		setSize(600, 400);
		setVisible(true);
	}

	double calculation(String exp0) {
		int i;
		double num, sum;
		Vector<Double> v = new Vector<Double>();
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
	}

	public static void main(String[] args) {
		CalcGUI_v4_frame cac1 = new CalcGUI_v4_frame();
	}
}
