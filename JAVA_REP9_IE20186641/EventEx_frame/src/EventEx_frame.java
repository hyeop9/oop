import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class EventEx_frame extends JFrame{

	EventEx_frame() {
		super("Test Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1, 5, 5));

		JButton bt = new JButton("Button bt");
		bt.setFont(new Font("맑은 고딕", 0, 20));

		JTextField tf = new JTextField("TextField tf1 : ", 20);
		tf.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tf.setHorizontalAlignment(SwingConstants.CENTER); // 문자열 위치 지정

		c.add(bt);
		c.add(tf);

		setLocation(300, 300);
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx_frame();
	}
}