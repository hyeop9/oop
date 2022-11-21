import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
    JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");

    KeyCharEx() {
        setTitle("KeyListener의 문자 키 입력 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        la.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        la.setHorizontalAlignment(SwingConstants.CENTER);
        la.setVerticalAlignment(SwingConstants.CENTER);

        c.setLayout(new BorderLayout());
        c.add(la);

        c.addKeyListener(new MyKeyListener()); // 키 리스너 달기
        setLocation(300, 300);
        setSize(600, 480);
        setVisible(true);

        c.requestFocus(); // 컨텐트 팬에 포커스 설정. 키 입력 가능해짐
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            System.out.println("Change Color!!!");

            switch (e.getKeyChar()) {
                case '\n':
                    la.setFont(new Font("Times New Roman", Font.BOLD, 50));
                    la.setText("r=" + r + ", g=" + g + ", b=" + b);

                    Container cp = getContentPane();
                    cp.setBackground(new Color(r, g, b));

                    break;
                case 'q':
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new KeyCharEx();
    }

}
