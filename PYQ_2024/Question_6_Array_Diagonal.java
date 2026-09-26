package PYQ_2024;

/*

Define a class to accept values into an integer array
of order 4 x 4 and check whether it is a DIAGONAL array or not.
An array is DIAGONAL if the sum of the left diagonal elements
equals the sum of the right diagonal elements.
Print the appropriate message.

    Example:

    3 4 2 5
    2 5 2 3
    5 3 2 7
    1 3 7 1

Sum of the left diagonal element = 3 + 5 + 2 + 1 = 11

Sum of the right diagonal element = 5 + 2 + 3 + 1 = 11
 */

import java.util.Scanner;

public class Question_6_Array_Diagonal
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

//        int arr[][] = {
//                        {3, 4, 2, 5},
//                        {2, 5, 2, 3},
//                        {5, 3, 2, 7},
//                        {1, 3, 7, 1}
//        };

        //Declaration
        int[][] arr = new int[4][4];

        //Input
        System.out.println("Enter elements for 4x4 array :");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        //Calculation
        int ld_sum = 0; // where i = j
        int rd_sum = 0; // where i+j = n-1

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if(i==j)
                    ld_sum += arr[i][j];
                else if(i+j == 3)
                    rd_sum += arr[i][j];
            }
        }

        if (rd_sum == ld_sum)
            System.out.println("The array is a DIAGONAL array.");
        else
            System.out.println("The array is NOT a DIAGONAL array.");
    }
}
