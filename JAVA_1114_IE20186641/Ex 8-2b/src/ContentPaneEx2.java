import javax.swing.*;
import java.awt.*;

public class ContentPaneEx2 extends JFrame {

	ContentPaneEx2() {

		setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.ORANGE); // 오랜지색 배경 설정

		contentPane.setLayout(new BorderLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기
		contentPane.setLayout(new GridLayout(2, 4)); // 컨텐트팬에 FlowLayout 배치관리자 달기
		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기

		contentPane.add(new JButton("OK1")); // OK 버튼 달기
		contentPane.add(new JButton("OK2")); // OK 버튼 달기
		contentPane.add(new JButton("OK3")); // OK 버튼 달기
		contentPane.add(new JButton("OK4")); // OK 버튼 달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기

		JButton b = new JButton("버튼");
		Color c = new Color(100, 100, 100);
		b.setBackground(c);
//		b.setBackground(Color.BLUE);	// 버튼의 배경색을 green색으로 설정
//		b.setBackground(new Color(100, 200, 200));	// 버튼의 배경색을 green색으로 설정

		contentPane.add(b);	// 컨탠트팬에 버튼 달기

		JLabel la = new JLabel("안녕하세요");
		la.setFont(new Font("고딕체", Font.BOLD, 30));
		contentPane.add(la);	// 컨탠트팬에 문자열 달기
		// contentPane.add(new JLabel("안녕하세요"));	// 컨탠트팬에 문자열 달기

		setLocation(300, 300);
		setSize(300, 150); // 프레임 크기 300x150 설정
		setVisible(true); // 화면에 프레임 출력
	}

	public static void main(String[] args) {
		new ContentPaneEx2();
	}
}
