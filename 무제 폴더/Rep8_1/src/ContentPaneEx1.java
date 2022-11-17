import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ContentPaneEx1 extends JFrame {

	ContentPaneEx1() {
		setTitle("FlowLayout() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		for (int i = 1; i < 45; i++) {
			JButton b = new JButton(Integer.toString(i));
			// b.setSize(50, 50);
			cp.add(b);
		}

		setSize(1000, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		ContentPaneEx1 frame = new ContentPaneEx1();
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
