package PYQ_2024_Specimen;

/*

Define a class to accept values in integer array of size 10.
Sort them in ascending order using selection sort technique.
Display the sorted array.

 */

import java.util.Scanner;

public class Question_4_Sorted_Array
{
    public static void main (String []args)
    {
        Scanner sc= new Scanner (System.in);

        int n= 10;
        int arr[] = new int[n];

        System.out.println("Enter n Integers");
        for(int i= 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

    }
}
