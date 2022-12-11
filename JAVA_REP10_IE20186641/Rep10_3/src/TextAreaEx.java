import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreaEx extends JFrame {

	TextAreaEx() {
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);

		setSize(450, 450);
		setVisible(true);
	}

	class MyCenterPanel extends JPanel {
		JTextField tf;
		JButton btn;
		JTextArea ta;
		JLabel j1;

		MyCenterPanel() {
			setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

			j1 = new JLabel("아래 창에 문자열을 입력하고 버튼을 클릭하세요");
			j1.setFont(new Font("굴림", Font.BOLD, 15));
			add(j1);

			tf = new JTextField(20);
			tf.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
			add(tf);

			btn = new JButton("추가");
			btn.setFont(new Font("맑은 고딕", Font.ITALIC, 20));

			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = tf.getText() + "\n";
					ta.append(str);

					tf.setText("");
				}
			});
			add(btn);

			ta = new JTextArea("", 7, 20);
			ta.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
			add(new JScrollPane(ta));
		}
	}

	public static void main(String[] args) {
		new TextAreaEx();
	}
}
