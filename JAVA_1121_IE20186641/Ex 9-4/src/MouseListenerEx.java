import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
	JLabel la = new JLabel("Hello");

	MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.addMouseListener(new MyMouseListener());

		cp.setLayout(null);

		la.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		la.setSize(100, 30);
		la.setLocation(50, 50);
		cp.add(la);
		setLocation(300, 300);
		setSize(500, 500);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스의 클릭 좌표 x
			int y = e.getY(); // 마우스의 클릭 좌표 y
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}


	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
