package com.lodderb;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result++ is now " + result);
        result--;
        System.out.println("Result-- is now " + result);

        result += 2;
        System.out.println("Result+= 2 is now " + result);
        result *= 10;
        System.out.println("Result*= 10 is now " + result);
        result -= 10;
        System.out.println("Result-= 10 is now " + result);
        result /= 10;
        System.out.println("Result/= 10 is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an Alien!");
        else
            System.out.println("It is an Alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");
        else
            System.out.println("You don't have the high score!");

        int secondTopScore = 90;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (!isCar)
            System.out.println("This is not supposed to happen");

        isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) ;
            System.out.println("wasCar is true");

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. add both numbers up and multiply  by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.

        double firstValue = 20d;
        double secondValue = 80d;
        double total = (firstValue + secondValue) * 25;
        System.out.println("Total equals " + firstValue + " + " +secondValue + " * 25 = " + total);
        total %= 40;
        System.out.println("The remainder of Total %40 equals " + total);
        if(total <= 20)
            System.out.println("Total was over the limit");

    }
}
