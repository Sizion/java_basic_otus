package home_work_22.test.junit;

import java.util.Arrays;
import static home_work_22.test.junit.ArraysUtl.*;

public class Main {

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
