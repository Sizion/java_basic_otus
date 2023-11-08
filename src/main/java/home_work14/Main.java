package home_work14;

public class Main {
    public static void doubleArray() {
        long t = System.currentTimeMillis();
        double[] arr = new double[40_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println("Time doubleArray = " + (System.currentTimeMillis() - t));
    }

    public static void doubleArrayThread1() throws InterruptedException {
        //long t = System.currentTimeMillis();
        double[] arr = new double[40_000_000];

        int countThread = 4;
        int range = arr.length / countThread;

        for (int i = 0; i < countThread; i++) {
            int inc = i;
            Thread thread = new Thread(() -> {
                for (int j = inc * (range); j < (range) * (inc + 1); j++) {
                    arr[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            });
            thread.start();
           // thread.join();
        }

       // System.out.println("Time doubleArrayThread1 = " + (System.currentTimeMillis() - t));

    }

    public static void doubleArrayThread2() throws InterruptedException {
        long t = System.currentTimeMillis();
        double[] arr = new double[40_000_000];

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr.length / 4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = arr.length / 4; i < arr.length / 2; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = arr.length / 2; i < arr.length - arr.length / 4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = arr.length - arr.length / 4; i < arr.length; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Time doubleArrayThread2 = " + (System.currentTimeMillis() - t));

    }

    public static void main(String[] args) throws InterruptedException {

        doubleArray();

        long t = System.currentTimeMillis();
        doubleArrayThread1();
        System.out.println("Time doubleArrayThread1 = " + (System.currentTimeMillis() - t));

        doubleArrayThread2();
    }
}
