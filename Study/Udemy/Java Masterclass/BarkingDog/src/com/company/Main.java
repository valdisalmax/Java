package com.company;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println(bark(true, 23));

    }

    public static boolean bark(boolean barking, int hourOfDay)
    {
        if (hourOfDay < 0 || hourOfDay > 23)
        {
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22)
        {
            return true;
        }
        return false;
    }

}

