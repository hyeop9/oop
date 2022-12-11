import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAPIEx extends JFrame{
	Container contentPane;
	JButton b1, b2, b3, b4;

	SwingAPIEx() {
		setTitle("Swing 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

		// 위치와 크기 정보 버튼 생성
		b1 = new JButton("위치와 크기 정보");
		b1.setFont(new Font("고딕체", Font.BOLD, 20));
		b1.addActionListener(new MyButtonListener());
		contentPane.add(b1);

		// 모양 정보 버튼 생성
		b2 = new JButton("모양 정보");
		b2.setOpaque(true); // 배경색이 가능하도록 설정
		b2.setForeground(Color.BLUE);
		b2.setBackground(Color.lightGray);
		b2.setFont(new Font("고딕체", Font.ITALIC, 20)); // 고딕체 20픽셀 폰트 지정
		b2.addActionListener(new MyButtonListener());
		contentPane.add(b2);

		// 작동하지 않는 버튼 생성
		b3 = new JButton("작동하지 않는 버튼");
		b3.setFont(new Font("고딕체", Font.PLAIN, 20)); // 고딕체 20픽셀 폰트 지정
		b3.setEnabled(false);
		b3.addActionListener(new MyButtonListener()); // Action 리스너에 이벤트 발생
		contentPane.add(b3);

		// 숨기기/보이기 토글 버튼 생성
		b4 = new JButton("숨기기/보이기");
		b4.setFont(new Font("고딕체", Font.BOLD, 20));
		b4.addActionListener(new MyButtonListener());
		contentPane.add(b4);

		setSize(280, 350);
		setVisible(true);
	}

	// 버튼에 등록된 Action 리스너 구현
	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource(); // 선택된 버튼의 주소 알아내기

			// source 가 어떤 버튼인지 구분하고 이벤트 처리
			if (source == b1) { // "위치와 크기 정보" 버튼이 선택된 경우
				System.out.println("버튼의 위치와 크기");
				System.out.println("위치 = (" + b1.getX() + "," + b1.getY() + ")");
				System.out.println("위치 = (" + b1.getWidth() + "x" + b1.getHeight() + ")");

				JPanel c = (JPanel) b2.getParent(); // 부모 컨테이너의 주소를 알아낸다. 부모는 컨텐트팬
				System.out.println("컨텐트팬의 위치와 크기");
				System.out.println("위치 = (" + c.getX() + "," + c.getY() + ")");
				System.out.println("위치 = (" + c.getWidth() + "x" + c.getHeight() + ")");
			} else if (source == b2) { // "모양 정보" 버튼이 선택된 경우
				System.out.println("폰트 = " + b2.getFont()); // 폰트 이름 출력
				System.out.println("폰트 = " + b2.getBackground()); // 배경색 출력
				System.out.println("폰트 = " + b2.getForeground()); // 글자색 출력
			} else { // "숨기기/보이기" 버튼이 선택된 경우
				if (b1.isVisible()) { // 현재 다른 버튼이 보이는 상태이면 모두 보이지 않게 한다.
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				} else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
			}
		}
	}


	public static void main(String[] args) {
		new SwingAPIEx();
	}

}
