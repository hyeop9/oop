import java.util.*;

class TimerThread extends Thread {

    int n = 0;
    int intTime;

    public TimerThread() {
        intTime = 0;
        setName("TH");
    }

    public TimerThread(int a, String s) {
        intTime = a;
        setName(s);
    }

    public void run() {

        while (true) {
            n++;
            try {
                Thread.sleep(intTime);

                if (getName().equals("Th1")) {
                    System.out.println("스레드A -- " + n);
                } else if (getName().equals("Th2")) {
                    System.out.println("                  스레드B -- " + n);
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadEx_a3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TimerThread th1 = new TimerThread(1000, "Th1");
        TimerThread th2 = new TimerThread(500, "Th2");
        th1.start();
        th2.start();
    }
}
