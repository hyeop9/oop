import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lotto_GUI_Null3 extends JFrame {

    int get_count;

    public Lotto_GUI_Null3() {
        super("로또 추첨 게임"); // 타이틀
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        get_count = 1;

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

            JButton buyLotto = new JButton("로또 추첨");
            buyLotto.setSize(270, 100);
            buyLotto.setLocation(560, 450);
            buyLotto.setFont(new Font("맑은 고딕", Font.BOLD, 16));
            buyLotto.setBackground(Color.BLACK);
            buyLotto.setForeground(Color.WHITE);
            buyLotto.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    String str = "", str0 = "", str2 = "";
                    tf2.setText("   추첨번호 : ");

                    int ok, tmp, i;

                    for (i = 0; i < 6; i++) {
                        Lotto[i] = 0;
                    }

                    while (get_count < 7) {
                        ok = 1;
                        tmp = (int) (Math.ramdom() * 45 + 1);

                        for (i = 0; i < 7; i++) {
                            if (tmp == Lotto[i]) {
                                ok = 0;
                            }
                        }
                        if (ok == 1) {
                            Lotto[get_count] = tmp;
                            get_count++;
                        }
                    }

                    if (get_count == 7) {
                        System.out.println("이번주 행운의 번호는");
                        for (i = 0; i < 6; i++) {
                            System.out.print(Lotto[i] + " ");
                        }
                        System.out.println("+ 보너스" + Lotto[i] + "입니다");
                    }

                    for (i = 0; i < 6; i++) {
                        str = Integer.toString(Lotto[i]) + " ";
                        str0 = tf2.getText() + str;
                        tf2.setForeground(Color.RED);
                        tf2.setText(str0);
                    }
                    str = "+ <" + Integer.toString(Lotto[i]) + ">";
                    str0 = tf2.getText() + str;
                    tf2.setText(str0);
                }

                int cnt = 0, j;



                str0 =tf2.getText()+"O O O O O O + 보너스 번호 )";
                    tf2.setForeground(Color.RED);
                    tf2.setText(str0);

                    tf3.setText("");
                str =" 추첨결과 : "+Integer.toString(0)+" 개 당첨, 번호 : "+str2;
                str0 =tf3.getText()+str;
                    tf3.setFont(new

                Font("맑은 고딕",Font.BOLD, 16) {
                });
                    tf3.setForeground(Color.MAGENTA);
                    tf3.setText(str0);
            }
            });
            add(buyLotto);

            JButton reset = new JButton("Re-Game");
            reset.setSize(260, 100);
            reset.setLocation(840, 450);
            reset.setFont(new Font("맑은 고딕", Font.BOLD, 16));
            reset.setBackground(Color.BLACK);
            reset.setForeground(Color.WHITE);
            reset.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    get_count = 1;
                    tf1.setForeground(Color.BLACK);
                    tf1.setText("  선택번호 : ");
                    tf1.setForeground(Color.BLACK);
                    tf1.setText("  추첨번호 : ");
                    tf1.setForeground(Color.BLACK);
                    tf1.setText("  당첨결과 : ");
                }
            });
            add(reset);

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

                bt.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String str = "", str0 = "";
                        JButton b = (JButton) e.getSource();

                        int cnt, i, win, j, tmp;
                        int ok_generation = 1;

                        if (get_count < 7) {
                            str = b.getText();

                            str0 = "  선택번호[" + Integer.toString(get_count) + "] " + str + " 버튼 클릭";
                            tf1.setText(str0);
                            get_count++;

                            if (get_count == 7) {
                                str0 = tf1.getText() + " : 선택완료 ";
                                tf1.setForeground(Color.BLUE);
                                tf1.setText(str0);
                            }
                        }
                    }
                });
                add(bt);
            }
        }
    }

    static public void main(String[] arg) {
        new Lotto_GUI_Null3();
    }
}
