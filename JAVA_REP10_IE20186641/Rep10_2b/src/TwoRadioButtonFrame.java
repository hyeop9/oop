import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoRadioButtonFrame extends JFrame {

	JButton red;
	JButton blue;

	TwoRadioButtonFrame() {
		super("Two Radio Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		red = new JButton("  Red  ");
		blue = new JButton("  Blue  ");

		ButtonGroup g = new ButtonGroup();
		g.add(red);
		g.add(blue);

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
		new TwoRadioButtonFrame();
	}
}
