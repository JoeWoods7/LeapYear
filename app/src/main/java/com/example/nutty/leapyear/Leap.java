package com.example.nutty.leapyear;
import java.util.Scanner;


public class Leap
{
    public static void main (String[]args)
    {

    }
    String leapYear(int yr){
        while (yr > 1582 )
        {
            System.out.print ("Enter a Year : \n [1111 to Quit] ");


            //gregorian leap year is leap if it is not only divisble by 4 but also it has to be divisible by 400 and not by 100 if it is a centurial year
            if ((yr %4 ==0 || yr %400 == 0) && (yr>1999 || yr %100 !=0))
                return ("A Leap year \n");
            else
                // prints if it is not a leap year
                return  ("Not a Leap Year \n");
        }
         return "Gregorian Calendar starts from 1582 Thank You!!";
    }
}
