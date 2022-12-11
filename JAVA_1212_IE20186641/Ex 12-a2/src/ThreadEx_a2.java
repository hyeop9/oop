class TimerThread extends Thread {

    int n = 0;

    public void run() {

        while (true) {
            System.out.println(n);
            n++;
            try {
                Thread.sleep(1000);

                if (n == 0) {
                    System.out.println("스레드 종료");
                    return;
                }

            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadEx_a2 {

    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        th.start();
    }
}
