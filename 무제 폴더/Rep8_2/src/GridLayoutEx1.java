import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GridLayoutEx1 extends JFrame {

	GridLayoutEx1() {
		setTitle("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new GridLayout(5,9,10,10));

		for (int i = 1; i <= 45; i++) {
			JButton b = new JButton(Integer.toString(i));
			// b.setSize(50, 50);
			cp.add(b);
		}

		setSize(600, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		GridLayoutEx1 frame = new GridLayoutEx1();
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
