import java.awt.*;
import javax.swing.*;

class LeftPanel extends JPanel {
	JLabel la1, la2;
	JButton bt1, bt2;

	LeftPanel() {
		la1 = new JLabel("TEST Left Panel Label1", SwingConstants.CENTER);
		la2 = new JLabel("TEST Left Panel Label2", SwingConstants.CENTER);
		bt1 = new JButton("Left Panel Button 1");
		bt2 = new JButton("Left Panel Button 2");
		add(la1);
		add(bt1);
		add(la2);
	}
}

class RightPanel extends JPanel {
	JLabel la1, la2;
	JButton bt1, bt2;

	RightPanel() {
		la1 = new JLabel("Label1", SwingConstants.CENTER);
		la2 = new JLabel("Label2", SwingConstants.CENTER);
		bt1 = new JButton("Button 1");
		bt2 = new JButton("Button 2");
		add(la1);
		add(bt1);
		add(la2);
		add(bt2);
	}
}

public class TestFrame2 extends JFrame {

	public TestFrame2() {
		Container cp = getContentPane();
		cp.setLayout(null);

		LeftPanel p1 = new LeftPanel();
		p1.setBackground(Color.YELLOW);
		p1.setLayout(new GridLayout(4, 1, 10, 10));
		p1.setLocation(20, 20);
		p1.setSize(250, 250);

		RightPanel p2 = new RightPanel();
		p2.setBackground(new Color(100, 100, 150));
		p2.setLayout(new GridLayout(1, 4, 0, 0));
		p2.setLocation(290, 20);
		p2.setSize(250, 250);

		Panel p3 = new Panel();
		p3.setBackground(Color.BLACK);
		p3.setLayout(null);
		p3.setLocation(10, 10);
		p3.setSize(560, 340);

		JButton bt = new JButton("Button OK");
		bt.setLocation(220, 290);
		bt.setSize(120, 40);
		p3.add(bt);

		p3.add(p1);
		p3.add(p2);
		cp.add(p3);

		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	static public void main(String[] args) {
		new TestFrame2();
	}
}
