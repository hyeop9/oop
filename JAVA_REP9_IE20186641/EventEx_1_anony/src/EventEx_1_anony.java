import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class EventEx_1_anony extends JFrame {

    EventEx_1_anony() {
        super("Test Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 5, 5));

        JButton bt = new JButton("Button bt");
        bt.setFont(new Font("맑은 고딕", 0, 20));

//        BtListener listenerBt = new BtListener();
//        bt.addActionListener(listenerBt);

        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JButton b = (JButton) e.getSource();

                String str = b.getText();
                System.out.println(str + " 버튼 클릭");

                str = "버튼 클릭 이후";
                b.setText(str);
            }
        });

        JTextField tf = new JTextField("TextField tf1 : ", 20);
        tf.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        tf.setHorizontalAlignment(SwingConstants.CENTER); // 문자열 위치 지정

//        TfListener listenerTf = new TfListener();
//        tf.addActionListener(listenerTf);

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField) e.getSource();

                String str = t.getText();
                System.out.println("텍스트 필드 내용 -> " + str);

                str += " --> 텍스트 추가 이후";
                t.setText(str);
            }
        });

        c.add(bt);
        c.add(tf);

        setLocation(300, 300);
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventEx_1_anony();
    }
}
