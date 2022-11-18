import java.awt.*;
import javax.swing.*;

class NullContainer extends JFrame {

    public NullContainer(int x, int y) {
        setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(null);

        int Hgap = 10, Vgap = 10, xind = 1, yind = 1;
        int xPos = 0, yPos = 0;

        for (int i = 1; i <= 45; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setSize(100, 100);

            xPos = 100 * (xind - 1) + Hgap * xind;
            yPos = 100 * (yind - 1) + Vgap * yind;

            b.setFont(new Font("맑은 고딕", Font.BOLD, 20));
            b.setLocation(xPos, yPos);

            if (i % 9 == 0) {
                yind++;
                xind = 1;
            } else {
                xind++;
            }
            cp.add(b);
        }
    setSize(1000, 560);
    setVisible(true);
    }
}

public class NullContainerEx2 {
    public static void main(String[] args) {
        new NullContainer(1000, 600);
        new NullContainer(1000, 1000);
        new NullContainer(2000, 1200);
    }
}

