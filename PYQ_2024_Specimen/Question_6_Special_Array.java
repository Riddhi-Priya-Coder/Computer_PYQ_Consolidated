package PYQ_2024_Specimen;

/*

Define a class to accept values into a 3 × 3 array
 and check if it is a special array. An array is
 a special array if the sum of the even elements = sum of the odd elements.

Example:
A[ ][ ]={{ 4 ,5, 6}, { 5 ,3, 2}, { 4, 2, 5}};
Sum of even elements = 4 + 6 + 2 + 4 + 2 = 18
Sum of odd elements = 5 + 5 + 3 + 5 = 18
 */

import java.util.Scanner;

public class Question_6_Special_Array
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("Enter the elements of the Arrays : ");
        for (int i = 1; i < 4; i++)
        {
            for (int j = 1; j < 4; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
