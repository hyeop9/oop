import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubButton_2 extends JFrame {

    JButton plus10;
    JButton minus10;
    JTextField tf;
    int num;

    AddSubButton_2() {
        super("Test Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 10, 10));

        num = 0;

        UpPannel jpUp = new UpPannel();
        DownPannel jpDown = new DownPannel();

        c.add(jpUp);
        c.add(jpDown);

        setLocation(300, 300);
        setSize(600, 400);
        setVisible(true);
    }

    class UpPannel extends JPanel {
        UpPannel() {
            setBackground(Color.WHITE);
            setLayout(new BorderLayout());
            tf = new JTextField("0", 20);
            tf.setFont(new Font("맑은 고딕", Font.BOLD, 60));
            tf.setHorizontalAlignment(SwingConstants.CENTER);
            add(tf);
        }
    }

    class DownPannel extends JPanel {
        DownPannel() {
            setBackground(Color.CYAN);
            setLayout(new GridLayout(2, 1, 10, 10));
            plus10 = new JButton("+10");
            plus10.setFont(new Font("맑은 고딕", 0, 40));
            minus10 = new JButton("-10");
            minus10.setFont(new Font("맑은 고딕", 0, 40));

            add(plus10);
            add(minus10);

            MyActionListener listener = new MyActionListener();
            plus10.addActionListener(listener);
            minus10.addActionListener(listener);
        }
    }

    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            num = Integer.parseInt(tf.getText());

            if (e.getSource() == plus10) {
                num += 10;
            } else if (e.getSource() == minus10) {
                num -= 10;
            }
            tf.setText(Integer.toString(num));
        }
    }

    public static void main(String[] args) {
        new AddSubButton_2();
    }
}
