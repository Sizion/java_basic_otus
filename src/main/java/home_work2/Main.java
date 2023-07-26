package home_work2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{2, 2};
        int[] a3 = new int[]{1, 1, 1, 1, 1};

        System.out.println("1 Task ");
        System.out.println(Arrays.toString(getSumArrays(a1, a2, a3)));

        int[] s = new int[]{5, 3, 4, -2};

        System.out.println("2 Task");
        System.out.println((getExistDot(s) || getExistDot(getRevert(s)) ? "Exists Dot" : "Not exists Dot"));

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
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
        int[] sumArray;
        if (a.length > b.length && a.length > c.length) {
            sumArray = sumArrays(a, b);
            sumArray = sumArrays(a, c);
        } else if (b.length > c.length) {
            sumArray = sumArrays(b, a);
            sumArray = sumArrays(b, c);
        } else {
            sumArray = sumArrays(c, a);
            sumArray = sumArrays(c, b);
        }

        return sumArray;
    }

    /* Sum 2 arrays*/
    public static int[] sumArrays(int[] a, int[] b) {
        if (a.length > b.length) {
            for (int i = 0; i < b.length; i++) {
                a[i] = a[i] + b[i];
            }
        } else
            for (int i = 0; i < a.length; i++) {
                b[i] = b[i] + a[i];
            }
        return (a.length > b.length ? a : b);
    }


    /*Task 2 get exists dot*/
    public static boolean getExistDot(int[] a) {
        boolean existsDot = false;

        for (int i = 0; i < a.length; i++) {
            int sumRithSide = 0;
            for (int j = i + 1; j < a.length; j++) {
                sumRithSide = sumRithSide + a[j];
            }
            if (a[i] == sumRithSide) {
                existsDot = true;
            }
        }

        return existsDot;
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
        int[] b = a.clone();

        for (int i = 0; i < a.length; i++) {
            a[i] = b[b.length - i - 1];
        }

        return a;
    }
}
