package PYQ_2026;

/*

Write a program to accept a number and check if it is a Mark number or not.
 A number is said to be Mark when sum of the squares of each digit is an even number
 as well as the last digit of the sum and the last digit of the number given is same.

Example:
    n = 246
    sum = 2 x 2 + 4 x 4 + 6 x 6 = 56
    56 is an even number as well as last digit is 6 for both sum as well as the number.
 */

import java.util.*;
public class Question_6_Numbers
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num= sc.nextInt();

        int sum=0;
        while(num>0)
        {
            int d= num%10;
            sum+=d*d;
            num/=10;
        }

        if(sum%2==0)
        {
            System.out.println(sum);
            System.out.println("It is a mark number");
        }
        else
            System.out.println("Not a mark number");
    }

}
