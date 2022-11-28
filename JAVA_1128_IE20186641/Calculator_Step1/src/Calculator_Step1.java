import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculator_Step1 extends JFrame{

	Calculator_Step1() {
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

		JButton bt2 = new JButton("CANCEL");
		bt2.setFont(new Font("맑은 고딕", 0, 16));
		bt2.setSize(100, 50);
		bt2.setLocation(280, 100);

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
		Calculator_Step1 cac1 = new Calculator_Step1();
	}
}
