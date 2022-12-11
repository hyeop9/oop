import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubButton_1 extends JFrame {

    JTextField tf;

    AddSubButton_1() {
        super("Test Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 10, 10));

        UpPannel jpUp = new UpPannel();
        DownPannel jpDown = new DownPannel();

        c.add(jpUp);
        c.add(jpDown);

        setLocation(300, 300);
        setSize(400, 150);
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

            JButton plus10 = new JButton("+10");
            plus10.setFont(new Font("맑은 고딕", 0, 40));

            JButton minus10 = new JButton("-10");
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
            int num = 0;
            JButton b = (JButton) e.getSource();

            String op = b.getText();
            num = Integer.parseInt(tf.getText());

            if (op.compareTo("+10") == 0) {
                num += 10;
            } else if (op.compareTo("-10") == 0) {
                num -= 10;
            }
            tf.setText(Integer.toString(num));
        }
    }

    public static void main(String[] args) {
        new AddSubButton_1();
    }
}
