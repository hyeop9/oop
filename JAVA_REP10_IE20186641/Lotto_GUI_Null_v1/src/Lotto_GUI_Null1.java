import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lotto_GUI_Null1 extends JFrame {

    public Lotto_GUI_Null1() {
        super("로또 추첨 게임"); // 타이틀
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // CenterPanel을 프레임의 CENTER 영역에 부착한다.
        Container contentPane = getContentPane();
        contentPane.add(new CenterPanel(), BorderLayout.CENTER);

        setSize(1125, 710);
        setVisible(true);
    }

    class CenterPanel extends JPanel {

        CenterPanel() {

            int i, k = 1, m = 1;
            setLayout(null); // 배치관리자 삭제, 절대 위치에 컴포넌트 삽입

            int W3 = 1070 / 3 + 1, H3 = 100;

            JTextField tf1 = new JTextField("   선택번호 : ");
            tf1.setSize(W3, H3);
            tf1.setLocation(10, 560);
            tf1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
            add(tf1);

            JTextField tf2 = new JTextField("   추첨번호 : ");
            tf2.setSize(W3, H3);
            tf2.setLocation(20 + W3, 560);
            tf2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
            add(tf2);

            JTextField tf3 = new JTextField("   당첨결과 : ");
            tf3.setSize(W3, H3);
            tf3.setLocation(30 + W3 * 2, 560);
            tf3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
            add(tf3);

            JButton bt3 = new JButton("로또 추첨");
            bt3.setSize(270, 100);
            bt3.setLocation(560, 450);
            bt3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
            bt3.setBackground(Color.BLACK);
            bt3.setForeground(Color.WHITE);
            add(bt3);

            JButton bt4 = new JButton("Re-Game");
            bt4.setSize(260, 100);
            bt4.setLocation(840, 450);
            bt4.setFont(new Font("맑은 고딕", Font.BOLD, 16));
            bt4.setBackground(Color.BLACK);
            bt4.setForeground(Color.WHITE);
            add(bt4);

            int W = 100, H = 100;
            int Hgap = 10, Vgap = 10, xind = 1, yind = 1;

            int xPos = 0, yPos = 0;

            for (i = 1; i <= 45; i++) {

                String text = Integer.toString(i);
                JButton bt = new JButton(text);            // 문자열을 버튼 객체로 생성
                bt.setSize(W, H);
                bt.setFont(new Font("맑은 고딕", Font.BOLD, 20));

                xPos = (xind - 1) * W + Hgap * xind;  // 버튼의 x 좌표
                yPos = (yind - 1) * H + Vgap * yind;  // 버튼의 y 좌표

                bt.setLocation(xPos, yPos);    // 위치 지정

                if (i % 10 == 0) {
                    yind++;
                    xind = 1;
                } else {
                    xind++;
                }
                add(bt);
            }

        }
    }

    static public void main(String[] arg) {
        new Lotto_GUI_Null1();
    }
}
