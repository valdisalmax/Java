package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,-3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        BigDecimal number1 = BigDecimal.valueOf(num1);
        number1 = number1.setScale(3, RoundingMode.DOWN);

        BigDecimal number2 = BigDecimal.valueOf(num2);
        number2 = number2.setScale(3, RoundingMode.DOWN);

        if(number1.equals(number2)) {
            return true;
        }

        return false;
    }
}
