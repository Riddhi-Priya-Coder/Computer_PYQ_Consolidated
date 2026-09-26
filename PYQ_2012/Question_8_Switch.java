package PYQ_2012;

/*

Using a switch statement, write a menu-driven program to:

(a) Generate and display the first 10 terms of the Fibonacci series
    0, 1, 1, 2, 3, 5
    The first two Fibonacci numbers are 0 and 1,
    and each subsequent number is the sum of the previous two.

(b) Find the sum of the digits of an integer that is input.
    Sample Input: 15390
    Sample Output: Sum of the digits = 18

For an incorrect choice, an appropriate error message should be displayed.

 */

import java.util.Scanner;

public class Question_8_Switch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("1. Fibonacci Series");
        System.out.println("2. Sum of digits");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("Fibonacci Series: ");

                int a=0, b=1;
                System.out.print(a+" "+b);
                for(int i=1; i<=8; i++)
                {
                    System.out.print(" "+(a+b));

                    int temp=a;
                    a=b;
                    b=temp+b;
                }

                break;

            case 2:
                System.out.print("Enter a number whose sum of digits is to be found: ");
                int num=sc.nextInt();
                int sum=0;

                while(num>0)
                {
                    int d= num%10;
                    sum+=d;

                    num/=10;
                }

                System.out.println("Sum of Digits: "+sum);

                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
