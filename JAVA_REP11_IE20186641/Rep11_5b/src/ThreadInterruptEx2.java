import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
    private JLabel timerLabel;
    private boolean flag = false;

    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public void finish() {
        flag = true;
    }

    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
                if (flag == true) {
                    System.out.println("스레드를 강제로 종료합니다");
                    return;
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadInterruptEx2 extends JFrame {
    private Thread th;

    public ThreadInterruptEx2() {
        setTitle("hreadIterruptEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

        TimerRunnable runnable = new TimerRunnable(timerLabel);
        th = new Thread(runnable); // 스레드 생성
        c.add(timerLabel);

        JButton btn = new JButton("kill Timer");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runnable.finish();
                JButton btn = (JButton) e.getSource();
                btn.setEnabled(false);
            }
        });

        c.add(btn);
        setSize(300, 170);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new ThreadInterruptEx2();
    }
}
