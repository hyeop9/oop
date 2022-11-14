import javax.swing.*;
import java.awt.*;

public class GridLayoutEx3 extends JFrame {

    JButton[] bt;

    GridLayoutEx3() {

        bt = new JButton[46];

        setTitle("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout(10, 10));
        cp.add(new JLabel(), BorderLayout.NORTH);
        cp.add(new JLabel(), BorderLayout.SOUTH);
        cp.add(new JLabel(), BorderLayout.EAST);
        cp.add(new JLabel(), BorderLayout.WEST);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(5, 9, 10, 10));
        for (int i = 1; i <= 45; i++) {
            bt[i] = new JButton(Integer.toString(i));
            bt[i].setFont(new Font("맑은고딕", Font.BOLD, 20));
            jp.add(bt[i]);
        }
        cp.add(jp, BorderLayout.CENTER);

        setSize(1000, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutEx3 frame = new GridLayoutEx3();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
