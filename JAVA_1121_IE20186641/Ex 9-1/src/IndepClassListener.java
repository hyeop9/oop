import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {

	IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

		JButton btn = new JButton("Action");
		btn.setFont(new Font("맑은 고딕", Font.BOLD, 30)); // 문자열 위치 지정
		btn.addActionListener(new MyActionListener()); // Action 이벤트 리스너 달기
		cp.add(btn);

		setLocation(300, 300);
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}
}

// 독립된 클래스로 이벤트 리스너를 작성한다.
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource(); // 이벤트 소스 버튼 알아내기
		if (e.getActionCommand().equals("Action")) {
			b.setText("액션");
		} else {
			b.setText("Action");
		}
		System.out.println(b.getText());
	}
}