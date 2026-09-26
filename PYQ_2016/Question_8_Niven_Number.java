package PYQ_2016;

/*

Write a program to accept a number and check and display whether it is a Niven number or not.
(Niven number is that number which is divisible by its sum of digits.).

Example:
Consider the number 126. Sum of its digits is 1 + 2 + 6 = 9 and 126 is divisible by 9.

 */

import java.util.Scanner;

public class Question_8_Niven_Number
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sum=0,copy=num;

        while(num>0)
        {
            int d = num%10;
            sum+=d;

            num/=10;
        }


        if(copy%sum==0)
            System.out.println("It is Niven Number");
        else
            System.out.println("It is not a Niven Number");
    }
}
