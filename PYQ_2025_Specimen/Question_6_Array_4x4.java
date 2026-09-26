package PYQ_2025_Specimen;

/*

    Define a class to accept values into 4x4 array and find
    and display the sum of each row.

    Example:

        A[][]={
                {1,2,3,4},
                {5,6,7,8},
                {1,3,5,7},
                {2,5,3,1}
               };

    Output:

        sum of row 1 = 10 (1+2+3+4)
        sum of row 2 = 26 (5+6+7+8)
        sum of row 3 = 16 (1+3+5+7)
        sum of row 4 = 11 (2+5+3+1)

 */

import java.util.Scanner;

public class Question_6_Array_4x4
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

//        int arr[][] = new int [4][4];
//
//        //Input
//        System.out.println("Enter a 4 x 4 array : ");
//        for(int i =0; i<4; i++)
//        {
//            for(int j=0; j<4; j++)
//            {
//                arr[i][j]= sc.nextInt();
//            }
//        }

        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {1,3,5,7},
                {2,5,3,1}
        };

        //Calculation and printing
        for(int i =0; i<4; i++)
        {
            int row_sum = 0;
            for(int j=0; j<4; j++)
            {
                row_sum += arr[i][j];
            }
            System.out.println("Sum of row "+(i+1) + " = "+row_sum);
        }
    }
}
