package home_work_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintAB {

    public void printA() {
        synchronized (mon) {
            try {
                while (cond != 0) {
                    mon.wait();
                }
                System.out.print("A");
                cond++;
                mon.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                while (cond != 1) {
                    mon.wait();
                }
                System.out.print("B");
                cond++;
                mon.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                while (cond != 2) {
                    mon.wait();
                }
                System.out.print("C");
                cond=0;
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
                printAB.printA();
            });
        }


        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                printAB.printB();
            });
        }

        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                printAB.printC();
            });
        }

        service.shutdown();

    }
}