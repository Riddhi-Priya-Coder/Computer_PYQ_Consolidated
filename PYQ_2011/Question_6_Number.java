package PYQ_2011;

/*

Write a program to input a number and print whether the number is a special number or not.

(A number is said to be a special number,
if the sum of the factorial of the digits of the number is same as the original number).

Example:

        145 is a special number, because 1! + 4! + 5! = 1 + 24 + 120 = 145.
        (Where ! stands for factorial of the number and
        the factorial value of a number is the product of all integers from 1 to that number,
        example 5! = 1 * 2 * 3 * 4 * 5 = 120)

 */

import java.util.Scanner;

public class Question_6_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n= sc.nextInt();

        int copy = n;

        int sum_of_fact=0;

        while(n>0)
        {
            int d= n%10;
            int fact=1;
            for(int i=1; i<=d; i++)
            {
                fact *= i;
            }
            sum_of_fact += fact;
            n/=10;
        }

        if(sum_of_fact==copy)
            System.out.println("It is a special number");
        else
            System.out.println("It is not a special number");
    }
}
