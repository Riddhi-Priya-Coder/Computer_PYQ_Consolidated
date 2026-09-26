package PYQ_2025;

/*

Define a class to accept values into a 4 × 4 integer array.
Calculate and print the NORM of the array.
NORM is the square root of sum of squares of all elements.

        1	2	1	3
        5	2	1	6
        3	6	1	2
        3	4	6	3

Sum of squares of elements =
1 + 4 + 1 + 9 + 25 + 4 + 1 + 36 + 9 + 36 + 1 + 4 + 9 + 16 + 36 + 9 = 201

NORM = Square root of 201 = 14.177446878757825

 */

import java.util.Scanner;

public class Question_4_Array_4x4
{
    public static void main (String []args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a 4 x 4 Array: ");
        int arr [][] = new int [4][4];

        //Input
        for(int i= 0; i<4; i++)
        {
            for(int j= 0; j<4; j++)
            {
                arr [i][j]= sc.nextInt();
            }
        }

//        //Taking pre-defined array
//        int arr[][] = {
//                        {1, 2, 1, 3},
//                        {5, 2, 1, 6},
//                        {3, 6, 1, 2},
//                        {3, 4, 6, 3}
//        };

        //Calculation
        int sum=0;
        for(int i= 0; i<4; i++)
        {
            for(int j= 0; j<4; j++)
            {
                sum += arr[i][j] * arr[i][j];
            }
        }
        double norm = Math.sqrt(sum);
        System.out.println("NORM of the array = "+norm);

    }
}
