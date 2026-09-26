package PYQ_2018;

/*

Write a program to input a number and check
and print whether it is a Pronic number or not.
(Pronic number is the number which is the product of two consecutive integers)

Examples:
12 = 3 x 4
20 = 4 x 5
42 = 6 x 7

Answer

 */

import java.util.Scanner;

public class Question_5_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean pronic = false;

        for(int i = 1; i <= n - 1; i++)
        {
            if(n == i * (i + 1))
            {
                pronic = true;
                break;
            }
        }

        if(pronic)
            System.out.println(n + " is a Pronic Number");
        else
            System.out.println(n + " is not a Pronic Number");
    }
}