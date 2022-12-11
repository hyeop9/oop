import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
    JLabel timerLabel_th;

    public TimerThread(JLabel in_JLabel) {
        this.timerLabel_th = in_JLabel;
    }

    public void run() {
        int n = 0;
        while (true) {
            timerLabel_th.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadTimerEx extends JFrame {

    public ThreadTimerEx() {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setText("0");
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel);

        setLocation(300, 300);
        setSize(250, 150);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}
