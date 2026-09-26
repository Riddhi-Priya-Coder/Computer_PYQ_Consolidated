package PYQ_2024_Specimen;

/*

    Define a class to accept a 3-digit number and
    check whether it is a duck number or not.
    Note: A number is a duck number if it has zero in it.

    Example 1:
    Input: 2083
    Output: Invalid

    Example 2:
    Input: 103
    Output: Duck number
 */

import java.util.Scanner;

public class Question_7_Duck_Number
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n= sc.nextInt();

        int c=0;
        boolean flag = false;
        while(n>0)
        {
            int d= n%10;
            if(d==0)
                flag = true;
            n/=10;

            c++;
        }

        if(c == 3 && flag == true)
            System.out.println("Duck Number");
        else
            System.out.println("Invalid Number");

    }
}
