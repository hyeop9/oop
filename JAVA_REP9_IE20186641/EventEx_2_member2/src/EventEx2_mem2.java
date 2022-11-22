import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class EventEx2_mem2 extends JFrame {

    JButton bt;
    JTextField tf;
    int cnt;

    EventEx2_mem2() {
        super("Test Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 5, 5));

        cnt = 0;

        bt = new JButton("Button bt");
        bt.setFont(new Font("맑은 고딕", 0, 20));

        MyListener listenerBt = new MyListener();
        bt.addActionListener(listenerBt);

        tf = new JTextField("TextField tf1 : ", 20);
        tf.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        tf.setHorizontalAlignment(SwingConstants.CENTER); // 문자열 위치 지정

        MyListener listenerTf = new MyListener();
        tf.addActionListener(listenerTf);

        c.add(bt);
        c.add(tf);

        setLocation(300, 300);
        setSize(500, 200);
        setVisible(true);
    }

    class MyListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bt) {
                cnt++;
                String str = "버튼 클릭 " + Integer.toString(cnt);

                bt.setText(str);
                tf.setText("버튼이 클릭되었습니다" + cnt);
            }
            else if (e.getSource() == tf) {
                String str = tf.getText();

                bt.setText(str);
                tf.setText("텍스트 필드 입력 이후 : " + str);
            }
        }
    }

    public static void main(String[] args) {
        new EventEx2_mem2();
    }
}
