package home_work2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a1 = new int[]{6, 2, 3};
        int[] a2 = new int[]{2, 2};
        int[] a3 = new int[]{1, 1, 7, 1, 1};

        System.out.println("1 Task ");
        System.out.println(Arrays.toString(getSumArrays(a1, a2, a3)));

        int[] s1 = new int[]{5, 3, 4, -2};
        int[] s2 = new int[]{1, 1, 1, 1, 1, 5};
        int[] s3 = new int[]{7, 2, 2, 2};
        int[] s4 = new int[]{9, 4};

        System.out.println("2 Task");
        System.out.println((getExistDot(s1) ? "Exists Dot" : "Not exists Dot"));
        System.out.println((getExistDot(s2) ? "Exists Dot" : "Not exists Dot"));
        System.out.println((getExistDot(s3) ? "Exists Dot" : "Not exists Dot"));
        System.out.println((getExistDot(s4) ? "Exists Dot" : "Not exists Dot"));

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] c = new int[]{100, 9, 8, 7, 78, 5, 4, 3, 2, 1};


        System.out.println("3 Task");
        System.out.println(getOrder(a));
        System.out.println(getOrder(b));
        System.out.println(getOrder(c));

        System.out.println("4 Task ");
        System.out.println(Arrays.toString(getRevert(a)));

    }

    /*Task 1 get sum arrays*/
    public static int[] getSumArrays(int[] a, int[] b, int[] c) {

        int[] sumAr = new int[Math.max(Math.max(a.length, b.length), c.length)];
        sumArray(sumAr, a);
        sumArray(sumAr, b);
        sumArray(sumAr, c);

        return sumAr;
    }

    public static void sumArray(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = a[i] + b[i];
        }
    }

    /*Task 2 get exists dot*/
    public static boolean getExistDot(int[] a) {


        for (int i = 0; i < a.length; i++) {
            int rSum = 0;
            int lSum = 0;
            for (int r = i + 1; r < a.length; r++) {
                rSum = rSum + a[r];
            }

            for (int l = 0; l <= i; l++) {
                lSum = lSum + a[l];
            }

            if (rSum == lSum && rSum != 0) {
                return true;
            }

        }

        return false;
    }

    /* Task 3 get asc or desc array */
    public static String getOrder(int[] a) {
        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                asc = false;
            } else {
                desc = false;
            }
        }

        if (asc) {
            return "Массив возврастает";
        } else if (desc) {
            return "Массив убывает";
        } else {
            return "Массив не упорядочен";
        }
    }

    /* Task 4 get revert array*/
    public static int[] getRevert(int[] a) {
        int b;

        for (int i = 0; i < a.length / 2; i++) {
            b = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = b;

        }

        return a;
    }
}
