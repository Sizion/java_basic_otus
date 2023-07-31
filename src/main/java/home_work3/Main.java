package home_work3;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1");
        int[][] a = new int[3][3];
        setArray(a);
        printArray(a);
        System.out.println("Sum positive Elements = " + sumOfPositiveElements(a));

        System.out.println("Task 2");
        printSquare(3);

        System.out.println("Task 3");
        int[][] z = new int[3][3];
        setArray(z);
        printArray(z);
        setZeroDiagonal(z);
        System.out.println();
        printArray(z);

        System.out.println("Task 4");
        int[][] b = new int[3][3];
        setArray(b);
        printArray(b);
        System.out.println(findMax(b));

        System.out.println("Task 5");
        int[][] c = new int[3][3];
        setArray(c);
        printArray(c);
        System.out.println();
        System.out.println("Sum second column = " + getColumn(c));
        System.out.println("Sum second row = " + getRow(c));

    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (random() * 10);
            }
        }
    }

    /*Task 1*/

    public static int sumOfPositiveElements(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > 0) {
                    sum = sum + a[i][j];
                }
            }
        }
        return sum;
    }

    /*Task 2*/
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*Task 3*/
    public static void setZeroDiagonal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j || j == a.length-1 -i ) {
                    a[i][j] = 0;

                }
            }
        }
    }

    /*Task 4*/

    public static int findMax(int[][] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        return max;
    }

    /*Task 5*/
    public static int getColumn(int[][] a) {
        int sumColumn = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 1) {
                    sumColumn = sumColumn + a[i][j];
                }
            }
        }
        return sumColumn;
    }
    public static int getRow(int[][] a) {
        int sumRow = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 1) {
                    sumRow = sumRow + a[i][j];
                }
            }
        }
        return sumRow;
    }

}
