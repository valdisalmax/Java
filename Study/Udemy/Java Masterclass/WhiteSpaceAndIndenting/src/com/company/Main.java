package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int myVariable = 50;
        // expression "myVariable = 50
        // statement "int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        // statement "System.out.println("This is a test");"

        System.out.println("This is" +
                " another" +
                " still more");
        // also a statement

        int anotherVariable = 50; myVariable--;
        // Je kan meerdere statements op 1 lijn zetten maar
        // dat maakt het minder leesbaar
    }
}
