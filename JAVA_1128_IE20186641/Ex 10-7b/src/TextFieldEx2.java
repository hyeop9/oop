import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldEx2 extends JFrame {
	
	JLabel la;
	
	TextFieldEx2() {
		super("텍스트필드 만들기 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));

		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터공학과", 20));

		c.add(new JLabel("주소 "));

		JTextField tf3 = new JTextField("서울시...", 20);
		tf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				String str = t.getText() + "\n";
				la.setText(str);
			}
		});
		c.add(tf3);

		la = new JLabel("주소 : ");
		la.setOpaque(false);
		la.setFont(new Font("고딕체", Font.PLAIN, 14));
		c.add(la);
		
		setLocation(300, 300);
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldEx2();
	}
}