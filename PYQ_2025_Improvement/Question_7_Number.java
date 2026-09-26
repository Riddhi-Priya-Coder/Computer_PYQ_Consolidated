package PYQ_2025_Improvement;

/*

    Define a class to accept a number and
    check if the sum of the first digit and
    the last digit is an even number or an odd number.

    Example:

                           N = 2396    N = 9316
            First digit:   2         9
            Last digit:    6         6
            Sum:           8         15
            Output: Sum is even  Sum is odd

 */

import java.util.Scanner;

public class Question_7_Number
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num= sc.nextInt();

        int ld = num%10;
        int fd = 0;

        while (num > 0)
        {
            fd = num%10;
            num /= 10;
        }

        int sum = fd + ld;
        System.out.println(sum);
        if(sum%2==0)
            System.out.println("Sum is even");
        else
            System.out.println("Sum is odd");

    }
}
