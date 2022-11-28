import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldEx extends JFrame {
	TextFieldEx() {
		super("텍스트필드 만들기 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));

		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터공학과", 20));

		c.add(new JLabel("주소 "));
		c.add(new JTextField("서울시...", 20));
		
		setLocation(300, 300);
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldEx();
	}
}
