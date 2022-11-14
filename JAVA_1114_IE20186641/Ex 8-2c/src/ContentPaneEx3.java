import javax.swing.*;
import java.awt.*;

public class ContentPaneEx3 extends JFrame {

	ContentPaneEx3() {

		setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.ORANGE); // 오랜지색 배경 설정

		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기
		// contentPane.setLayout(new BorderLayout()); // 컨텐트팬에 BorderLayout 배치관리자 달기
		contentPane.setLayout(new GridLayout(10, 5)); // 컨텐트팬에 GridLayout 배치관리자 달기

		for (int i = 1; i <= 50; i++) {	// 10개의 버튼 부착
			String text = "OK " + Integer.toString(i);	// i를 문자열로 변환
			JButton button = new JButton(text);
			contentPane.add(button);	// OK 버튼 달기
		}

		setLocation(300, 300);
		setSize(600, 600); // 프레임 크기 300x150 설정
		setVisible(true); // 화면에 프레임 출력
	}

	public static void main(String[] args) {
		ContentPaneEx3 frame = new ContentPaneEx3();
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
