package home_work_22.test.junit;

import java.util.Arrays;

public class ArraysUtl {
    public static int[] getArrayAfterOne(int[] a) {
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] == 1 ) {
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
}
