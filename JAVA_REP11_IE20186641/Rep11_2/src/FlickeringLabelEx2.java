import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
    private long delay;
    int endTime;
    JLabel T_JLabel;
    int cnt = 0;
    String str;

    public TimerThread(JLabel in_JLabel, long delay, int end, String str) {
        this.delay = delay;
        T_JLabel = in_JLabel;
        endTime = end;
        this.str = str;
    }

    public void run() {
        int n = 0;
        System.out.printf("%s 스레드의 delay = %d\n", str, delay);

        System.out.println(currentThread().getName() + "스레드 시작");

        while (true) {
            if (n == 0) {
                T_JLabel.setBackground(Color.YELLOW);
                n = 1;
            } else {
                T_JLabel.setBackground(Color.GREEN);
                n = 0;
            }

            try {
                cnt++;
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\n ~~~~~~~~~ " + currentThread().getName() + "~~~~~~~~~~ 종료\n");
                return;
            }

            if (currentThread().getName().equals("TH1")) {
                System.out.println(currentThread().getName() + "===" + cnt);
                if (cnt == endTime) {
                    currentThread().interrupt();
                }
            } else {
                System.out.println("              " + currentThread().getName() + "===" + cnt);
                if (cnt == endTime) {
                    currentThread().interrupt();
                }
            }
        }
    }
}

public class FlickeringLabelEx2 extends JFrame {

    public FlickeringLabelEx2() {
        setTitle("FlickeringLabelEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel fLabel = new JLabel("깜빡");
        JLabel label = new JLabel("안깜빡");
        JLabel fLabel2 = new JLabel("여기도 깜빡");
        fLabel.setOpaque(true);
        fLabel2.setOpaque(true);

        TimerThread th = new TimerThread(fLabel, 1000, 5, "TH1");

        TimerThread th2 = new TimerThread(fLabel2, 1000, 10, "TH2");

        th.start();
        th2.start();

        c.add(fLabel);
        c.add(label);
        c.add(fLabel2);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlickeringLabelEx2();
    }
}
