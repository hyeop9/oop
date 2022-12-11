import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxPracticeFrame extends JFrame {

	JButton btn;

	public CheckBoxPracticeFrame() {
		super("CheckBox와 Item 이벤트 Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		Font ft = new Font("맑은 고딕", Font.BOLD, 20);

		btn = new JButton("text button");
		btn.setFont(ft);

		JCheckBox chk1 = new JCheckBox("버튼 비활성화");
		chk1.setFont(ft);

		JCheckBox chk2 = new JCheckBox("버튼 감추기");
		chk2.setFont(ft);

		chk1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("e.getStateChange() 결과 -> " + e.getStateChange());

				if (e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});

		chk2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("e.getStateChange() 결과 -> " + e.getStateChange());

				if (e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});

		c.add(chk1);
		c.add(chk2);
		c.add(btn);

		setSize(400, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxPracticeFrame();
	}
}
