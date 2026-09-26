package PYQ_2026;

/*
    Write a program to accept a two-dimensional integer array
    of order 4 x 5 as input from the user.
    Check if it is a Sparse Matrix or not.

    A matrix is considered to be a sparse,
    if the total number of zero elements is greater than the
    total number of non-zero elements. Print appropriate messages.

    Example:

        4	3	0	1	0
        1	0	0	2	0
        1	0	1	0	0
        0	3	2	0	0


        Number of zero elements = 11
        Number of non-zero elements = 9
        Matrix is a Sparse Matrix

 */

import java.util.Scanner;

public class Question_5_Arrays_2D
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        //Declaration of Array
        int arr[][] = new int[4][5];


        //Input
        System.out.println("Enter the elements of the Arrays : ");
        for (int i = 0; i < 4; i++)          //row
        {
            for (int j = 0; j < 5; j++)     //Columns
            {
                arr[i][j] = sc.nextInt();
            }
        }

        //Calculation

        int c_zero = 0;
        int c_non_zero = 0;

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (arr[i][j] == 0)
                    c_zero++;
                else
                    c_non_zero++;
            }
        }

//        //Displaying the Array (optional)
//        System.out.println("Displaying the Array you have entered : ");
//        for (int i = 0; i < 4; i++)
//        {
//            for (int j = 0; j < 5; j++)
//            {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }

        //Decision
        System.out.println("Number of zero elements = " + c_zero);
        System.out.println("Number of non-zero elements = " + c_non_zero);

        if (c_zero > c_non_zero)
            System.out.println("Matrix is a Sparse Matrix");
        else
            System.out.println("Not a sparse matrix");
    }

}
