package home_work_8;

import home_work_8.arrays.DoubleArray;

public class Main {
    public static void main(String[] args) {
        String[][] tryCountSum1 = {
                {"45", "13", "24", "99"},
                {"2", "2", "0", "11"},
                {"1", "55", "5", "100"},
                {"5", "6", "24", "-4"}
        };

        String[][] tryCountSum2 = {
                {"45", "13", "24", "99"},
                {"2", "2", "0", "11"},
                {"1", "55", "5", "LOL"},
                {"5", "6", "24", "-4"}
        };

        String[][] tryCountSum3 = {
                {"45", "13"},
                {"2", "2"},
        };

        //System.out.println("Sum = " + DoubleArray.sumDoublArray(tryCountSum1));
        //System.out.println("Sum = " + DoubleArray.sumDoublArray(tryCountSum2));
        System.out.println("Sum = " + DoubleArray.sumDoublArray(tryCountSum3));
    }
}
