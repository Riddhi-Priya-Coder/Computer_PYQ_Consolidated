package PYQ_2025;

/*

Define a class to accept a number. Check if the sum
of the largest digit and the smallest digit is an even
number or an odd number. Print appropriate messages.

    Sample Input:	        6425	        3748
    Largest digit:	         6	             8
    Smallest digit:	         2	             3

    Sample Output:	   Sum is even 	    Sum is odd

 */

import java.util.Scanner;

public class Question_8_Digits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int max = -1;
        int min = 999999;

        while(n>0)
        {
            int d= n%10;
            n /= 10;

            if(d>max)
                max=d;
            else if(d <min)
                min=d;
        }
        System.out.println("Largest Digit: "+max);
        System.out.println("Smallest Digit: "+min);

        int sum = max + min;
        if(sum % 2 == 0)
            System.out.println("Sum is even");
        else
            System.out.println("Sum is odd");
    }
}