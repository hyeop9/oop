import java.awt.*;
import javax.swing.*;

class CenterPane1 extends JPanel {

	public CenterPane1() {
		setLayout(new GridLayout(5, 9, 10, 10));

		for (int i = 1; i <= 45; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setFont(new Font("맑은고딕", Font.BOLD, 20));
			add(b);
		}
	}
}

public class GridLayoutEx2 extends JFrame{

	GridLayoutEx2() {

		setTitle("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new BorderLayout(10, 10));
		cp.add(new JLabel(), BorderLayout.NORTH);
		cp.add(new JLabel(), BorderLayout.SOUTH);
		cp.add(new JLabel(), BorderLayout.EAST);
		cp.add(new JLabel(), BorderLayout.WEST);
		cp.add(new CenterPane1(), BorderLayout.CENTER);

		setSize(1000, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		GridLayoutEx2 frame = new GridLayoutEx2();
	}
}
