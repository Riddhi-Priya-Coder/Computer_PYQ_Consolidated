package PYQ_2025_Improvement;

/*

Define a class to accept values into a 3x3 integer array
and print the product of each row elements.

    Example:

        3	1	2
        4	2	1
        5	1	2

    Output:

        Row 0 – 6
        Row 1 – 8
        Row 2 – 10

 */

import java.util.Scanner;

public class Question_4_Array_3x3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3 x 3 Array");
        int arr[][]= new int [3][3];

        for (int i= 0; i<3; i++)
        {
            for(int j= 0; j<3; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

    }
}
