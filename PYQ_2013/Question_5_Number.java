package PYQ_2013;

/*

The International Standard Book Number (ISBN) is a unique numeric book identifier
which is printed on every book. The ISBN is based upon a 10-digit code.

The ISBN is legal if:
1 × digit1 + 2 × digit2 + 3 × digit3 + 4 × digit4 + 5 × digit5 +
6 × digit6 + 7 × digit7 + 8 × digit8 + 9 × digit9 + 10 × digit10 is divisible by 11.

Example:
        For an ISBN 1401601499
        Sum = 1 × 1 + 2 × 4 + 3 × 0 + 4 × 1 + 5 × 6 +
        6 × 0 + 7 × 1 + 8 × 4 + 9 × 9 + 10 × 9 = 253 which is divisible by 11.

Write a program to:

1. Input the ISBN code as a 10-digit integer.

2. If the ISBN is not a 10-digit integer, output the message
   "Illegal ISBN" and terminate the program.

3. If the number is divisible by 11, output the message "Legal ISBN".
   If the sum is not divisible by 11, output the message "Illegal ISBN".

 */

import java.util.Scanner;

public class Question_5_Number
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ISBN: ");
        long isbn= sc.nextLong();

        int length = String.valueOf(isbn).length();
        int sum =0;

        if (length != 10)
            System.out.println("Illegal ISBN");
        else {
            for (int i = 10; i >= 1; i--) {
                sum += isbn % 10 * i;
                isbn /= 10;
            }

            if (sum % 11 == 0)
                System.out.println("Legal ISBN");
            else
                System.out.println("Illegal ISBN");
        }
    }
}
