package home_work_8.arrays;

import home_work_8.arrays.exception.AppArrayDataException;
import home_work_8.arrays.exception.AppArraySizeException;

public class DoubleArray {

    public static int sumDoublArray(String[][] a) {
        int sum = 0;
        if (a.length != 4 || a[0].length != 4) {
            throw new AppArraySizeException("Dude, just give me array[4][4] ?!");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);

                } catch (NumberFormatException ex) {
                    throw new AppArrayDataException("I can't convert - " + a[i][j] + " in - [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}
