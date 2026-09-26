package PYQ_2019;

/*

A tech number has even number of digits.
If the number is split in two equal halves,
then the square of sum of these halves is equal to the number itself.
Write a program to generate and print all four digits tech numbers.

Example:

Consider the number 3025

Square of sum of the halves of 3025 = (30 + 25)2
                                    = (55)2
                                    = 3025 is a tech number.

 */

import javax.swing.*;
import java.util.Scanner;

public class Question_9_Tech_Number
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sum=0,finale;
        if(num>= 1000 && num<=9999)
        {
            int first_h=num%100;
            int second_h=num/100;
            sum=first_h+second_h;
        }

        finale = sum*sum;

        if(finale==num)
            System.out.println("It is a Tech Number");
        else
            System.out.print("It is not a Tech Number");
    }
}
