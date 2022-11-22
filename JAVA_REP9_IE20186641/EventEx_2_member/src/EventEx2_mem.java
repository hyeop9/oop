import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class EventEx2_mem extends JFrame {

    JButton bt;
    JTextField tf;

    EventEx2_mem() {
        super("Test Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 5, 5));

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
                JButton b = (JButton) e.getSource();

                String str = b.getText();
                System.out.println(str + " 버튼 클릭");

                str = "버튼 클릭 이후";
                b.setText(str);

                tf.setText("버튼이 클릭되었습니다");
            }
            else if (e.getSource() == tf) {
                JTextField t = (JTextField) e.getSource();

                String str = t.getText();
                System.out.println("텍스트 필드 내용 -> " + str);

                str += " --> 텍스트 추가 이후";
                t.setText(str);

                bt.setText("텍스트 필드 입력 이후");
            }
        }
    }

    public static void main(String[] args) {
        new EventEx2_mem();
    }
}
