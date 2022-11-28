import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
	JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("  Disabled Button  ");
		JButton b3 = new JButton("getX(), getY()");

		b1.setForeground(Color.MAGENTA); // 글자색 설정
		b1.setFont(new Font("Arial", Font.ITALIC, 20));

		b2.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);

		b3.setFont(new Font("Arial", Font.BOLD, 20));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				setTitle(b.getX() + "," + b.getY());
			}
		});

		c.add(b1);
		c.add(b2);
		c.add(b3);

		setLocation(300, 300);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();
	}
}
