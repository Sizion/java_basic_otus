package home_work_21.threads.print;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintAB {

    public void print(String str, int cnt) {
        synchronized (mon) {
            try {
                while (cond != cnt) {
                    mon.wait();
                }
                System.out.print(str);
                if (str.equals("C")) {
                    cond=0;
                } else {
                    cond ++;
                }
                mon.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private final Object mon = new Object();
    private static int cond = 0;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        PrintAB printAB = new PrintAB();


        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                printAB.print("A", 0);
            });
        }


        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                printAB.print("B", 1);
            });
        }

        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                printAB.print("C", 2);
            });
        }

        service.shutdown();

    }
}