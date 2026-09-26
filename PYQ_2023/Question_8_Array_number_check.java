package PYQ_2023;
/*

Question_6_Binary_Search :
Define a class to accept values in integer array of size 10.
Find sum of one-digit number and sum of two-digit numbers entered.
Display them separately.

Example:

Input:
a[ ] = {2, 12, 4, 9, 18, 25, 3, 32, 20, 1}

Output:
Sum of one-digit numbers : 2 + 4 + 9 + 3 + 1 = 19
Sum of two-digit numbers : 12 + 18 + 25 + 32 + 20 = 107
*/

import java.util.*;
public class Question_8_Array_number_check
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        //Array declaration
        int digit[] = new int [10];

        //Taking input
        System.out.println("Enter 10 numbers");
        for(int i=0; i<10; i++)
            digit[i] = sc.nextInt();

        //main calculation
        int sd_sum = 0;
        int dd_sum = 0;

        for(int i=0; i<10; i++)
        {
            if(digit[i] >=0 && digit[i] <= 9)
                sd_sum += digit[i];

            else if(digit[i] >= 10 && digit[i] <= 99)
                dd_sum += digit[i];
        }

        //Printing the output
        System.out.println("Sum of one-digit numbers : "+ sd_sum);
        System.out.println("Sum of two-digit numbers : "+ dd_sum);
    }
}
