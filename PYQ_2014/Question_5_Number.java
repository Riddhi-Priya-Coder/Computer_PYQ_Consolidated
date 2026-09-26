package PYQ_2014;

/*

A special two-digit number is such that when the
sum of its digits is added to the product of its digits,
the result is equal to the original two-digit number.

Example:    Consider the number 59.
            Sum of digits = 5 + 9 = 14
            Product of digits = 5 * 9 = 45
            Sum of the sum of digits and product of digits = 14 + 45 = 59

Write a program to accept a two-digit number.
Add the sum of its digits to the product of its digits.
If the value is equal to the number input, then display
the message "Special two—digit number" otherwise, display the
message "Not a special two-digit number".

 */

import java.util.Scanner;

public class Question_5_Number
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two digit number: ");
        int num= sc.nextInt();

        //Not under current scope
        if(String.valueOf(num).length()!=2)
        {
            System.out.println("Not a 2 digit number");
        }

        else
        {

            int sum = 0, prod = 1, c = num;

            while (num > 0) {
                int d = num % 10;
                sum += d;
                prod *= d;

                num /= 10;
            }

            int final_ans = sum + prod;

            System.out.println("Sum of digits = " + sum);
            System.out.println("Product of digits = " + prod);
            System.out.println("Sum of the sum of digits and product of digits = " + final_ans);

            if (final_ans == c)
                System.out.println("It is a Special 2-digit Number");
            else
                System.out.println("Not a special 2-digit number");
        }
    }
}
