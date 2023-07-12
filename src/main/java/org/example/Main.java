package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /*  greetings();

        checkSign(13, 30, 23);

        selectColor();

        compareNumbers();

        addOrSubtractAndPrint(13, 23, true);*/


        Scanner sc = new Scanner(System.in);
        int i=-1;
        while (i<1 || i>5){
            System.out.println("Введите число от 1 до 5");
            i = sc.nextInt();
            switch (i){
                case (1):
                    greetings();
                    break;
                case (2):
                    checkSign(13, 30, 23);
                    break;
                case (3):
                    selectColor();
                    break;
                case(4):
                    compareNumbers();
                    break;
                case(5):
                    addOrSubtractAndPrint(13, 23, true);
                    break;
            }


        }

    }

    public static void greetings() {


        char[] chars = new String("Hello, World, from, Java").toCharArray();

        for (char ch : chars) {
            System.out.println(ch);
        }

    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 13;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 13;
        int b = 30;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue = initValue + delta;
            System.out.println(initValue);
        } else {
            initValue = initValue - delta;
            System.out.println(initValue);
        }
    }

}