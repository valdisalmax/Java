package com.lodderb;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(1, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sumOddNumber = 0;
        if ((start > end) || (start <= 0) || (end <= 0)) {
            return -1;
        } else {
            for (int i = start; i <+ end; i++) {
                if (isOdd(i)) {
                sumOddNumber += i;
                }
             }
            return sumOddNumber;
        }
    }
}
