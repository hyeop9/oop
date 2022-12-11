import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtonFrame extends JFrame {

	JButton red;
	JButton blue;

	TwoButtonFrame() {
		super("Two Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		red = new JButton("Red");
		blue = new JButton("Blue");

		c.add(red);
		c.add(blue);
		MyActionListener listener = new MyActionListener();
		red.addActionListener(listener);
		blue.addActionListener(listener);

		setSize(300, 100);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == red) {
				getContentPane().setBackground(Color.RED);
			} else if (e.getSource() == blue) {
				getContentPane().setBackground(Color.BLUE);
			}
		}
	}


	public static void main(String[] args) {
		new TwoButtonFrame();
	}
}
