package PYQ_2025_Specimen;

/*

Define a class to accept a number and
check whether it is a SUPERSPY number or not.
A number is called SUPERSPY if the
sum of the digits equals the number of the digits.

    Example 1:

    Input: 1021
    output: SUPERSPY number [SUM OF THE DIGITS = 1+0+2+1 = 4,
    NUMBER OF DIGITS = 4 ]

    Example 2:

    Input: 125
    output: Not an SUPERSPY number [1+2+5 is not equal to 3]

 */

import java.util.Scanner;

public class Question_7_Numbers_SuperSpy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = sc.nextInt();

        int sum=0;
        int dc=0;

        while (num > 0)
        {
            int d = num % 10;
            dc++;
            sum+=d;

            num /= 10;
        }

        if(dc==sum)
            System.out.println("It is a Super Spy Number");
        else
            System.out.println("It is not a Super Spy Number");
    }
}
