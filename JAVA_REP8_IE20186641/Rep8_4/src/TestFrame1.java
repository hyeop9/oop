import java.awt.*;
import javax.swing.*;

public class TestFrame1 extends JFrame {

	public TestFrame1() {
		Container cp = getContentPane();
		cp.setLayout(null);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p1.setBackground(Color.YELLOW);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.LIGHT_GRAY);

		JLabel la1 = new JLabel("TEST Label1", SwingConstants.CENTER);
		JLabel la2 = new JLabel("TEST Label2", SwingConstants.CENTER);

		JButton bt1 = new JButton("Button 1");
		JButton bt2 = new JButton("Button 2");
		JButton bt3 = new JButton("Button 3");
		JButton bt4 = new JButton("Button 4");
		JButton bt5 = new JButton("OK");

		bt5.setLocation(220, 290);
		bt5.setSize(120, 40);

		p3.setLayout(null);
		p3.setLocation(10, 10);
		p3.setSize(560, 340);

		p3.add(p1);
		p3.add(p2);
		p3.add(bt5);
		cp.add(p3);

		p1.setLayout(new GridLayout(3, 1, 10, 10));
		p1.setLocation(20, 20);
		p1.setSize(250, 250);
		p1.add(la1);
		p1.add(bt1);
		p1.add(la2);

		p2.setLocation(290, 20);
		p1.setSize(250, 250);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);

		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	static public void main(String[] args) {
		new TestFrame1();
	}
}
