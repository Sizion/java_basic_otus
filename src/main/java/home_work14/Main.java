package home_work14;

public class Main {
    public static void doubleArray() {
        long t = System.currentTimeMillis();
        double[] arr = new double[500_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println("Time doubleArray = " + (System.currentTimeMillis() - t));
    }

    public static void doubleArrayThread() throws InterruptedException {
        long t = System.currentTimeMillis();
        double[] arr = new double[500_000_000];

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr.length/4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                //System.out.println("Thread 1 " + i);
            }
            System.out.println("Thread 1 - " + arr.length/4);
        });

        Thread thread2 = new Thread(() -> {
            for (int i = arr.length/4; i < arr.length/2; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                //System.out.println("Thread 2 " + i);
            }
            System.out.println("Thread 2 -" + arr.length/2);
        });
        Thread thread3 = new Thread(() -> {
            for (int i = arr.length/2; i < arr.length-arr.length/4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                //System.out.println("Thread 3 " + i);
            }
            System.out.println("Thread 3 -" + (arr.length-arr.length/4));
        });
        Thread thread4 = new Thread(() -> {
            for (int i = arr.length-arr.length/4; i < arr.length; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                //System.out.println("Thread 4 " + i);
            }
            System.out.println("Thread 4 -" + arr.length);
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Time doubleArrayThread = " + (System.currentTimeMillis() - t));

    }

    public static void main(String[] args) throws InterruptedException {

        doubleArray();

        doubleArrayThread();
    }
}
