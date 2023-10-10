package home_work_22;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int[] getArrayAfterOne(int[] a) {

        boolean existsOne = true;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 1 && i != a.length - 1) {
                return Arrays.copyOfRange(a, i + 1, a.length);
            }
        }
        throw new RuntimeException();

    }

    public static boolean existsOnlyOneTwoArray(int[] a) {
        boolean existsOne = false;
        boolean existsTwo = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1 || a[i] > 2) {
                return false;
            } else if (a[i] == 1) {
                existsOne = true;
            } else if (a[i] == 2)
                existsTwo = true;
        }
        return existsOne && existsTwo;
    }

    public static void main(String[] args) {
        int[] a1 = {0, 0, 0, 1, 2, 2, 2};
        //    int[] a2 = {2,2,2,2,2};
        System.out.println(Arrays.toString(getArrayAfterOne(a1)));
        //   System.out.println(Arrays.toString(getArrayAfterOne(a2)));

        int[] b1 = {1, 2, 2, 1};
        int[] b2 = {1, 1};
        int[] b3 = {1, 3};
        int[] b4 = {1, 2, 2, 1};

        System.out.println("existsOnlyOneTwoArray = " + existsOnlyOneTwoArray(b1));
        System.out.println("existsOnlyOneTwoArray = " + existsOnlyOneTwoArray(b2));
        System.out.println("existsOnlyOneTwoArray = " + existsOnlyOneTwoArray(b3));
        System.out.println("existsOnlyOneTwoArray = " + existsOnlyOneTwoArray(b4));

    }
}
