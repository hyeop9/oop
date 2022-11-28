import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaEx extends JFrame {
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(5, 20);

	TextAreaEx() {
		super("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

		JLabel J1 = new JLabel("입력 후 <Enter> 키를 입력하세요");
		J1.setFont(new Font("굴림", Font.BOLD, 20));
		c.add(J1);

		tf.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
		c.add(tf);

		ta.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		c.add(new JScrollPane(ta));

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();

				String str = t.getText() + "\n";
				ta.append(str);

				t.setText("");
			}
		});

		setLocation(300, 300);
		setSize(400, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaEx();
	}
}