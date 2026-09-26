package PYQ_2024;

/*

Define a class to accept a number from user and
check if it is an EvenPal number or not.

(The number is said to be EvenPal number when
number is palindrome number (a number is palindrome
if it is equal to its reverse) and sum of its
digits is an even number.)

Example: 121 – is a palindrome number
Sum of the digits – 1+2+1 = 4 which is an even number

 */

import java.util.Scanner;

public class Question_5_EvenPal
{
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n= sc.nextInt();
        int rev=0, copy=n, sum=0;

        while(n>0)
        {
            int d = n % 10;
            rev = rev*10+d;
            sum += d;
            n /= 10;
        }
//        System.out.println(sum);
//        System.out.println(rev);

        if(rev==copy & sum%2==0)
            System.out.println("The number is an EvenPal number");
        else
            System.out.println("The number is not an EvenPal number");
    }
}
