package PYQ_2017;

/*

Write a program to accept a number and check
and display whether it is a spy number or not.
(A number is spy if the sum of its digits equals the product of its digits.)

Example: consider the number 1124.
Sum of the digits = 1 + 1 + 2 + 4 = 8
Product of the digits = 1 x 1 x 2 x 4 = 8

 */

import java.util.Scanner;

public class Question_5_Number
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum=0, prod=1;

        while(num>0)
        {
            int d = num%10;
            sum+=d;

            prod*=d;
            num/=10;
        }

        if(prod==sum)
            System.out.println("It is a Spy Number");
        else
            System.out.println("It is not a Spy Number");
    }
}
