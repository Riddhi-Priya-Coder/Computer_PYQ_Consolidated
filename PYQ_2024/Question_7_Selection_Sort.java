package PYQ_2024;

/*

Define a class pin code and store the given pin codes
in a single dimensional array. Sort these pin codes in
ascending order using the Selection Sort technique only.
Display the sorted array.

110061, 110001, 110029, 110023, 110055, 110006, 110019, 110033

 */

import java.util.Scanner;

public class Question_7_Selection_Sort
{
    public static void main(String args[])
    {
        int[] arr = {   110061, 110001,
                        110029, 110023,
                        110055, 110006,
                        110019, 110033};

        int n = arr.length;

        //Sorting - Selection
        for (int i=0; i<n-1; i++)
        {
            int idx = i;
            for (int j = i+1; j<n; j++)
            {
                if (arr[j] < arr[idx])
                    idx = j;
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        //Output
        System.out.println("Sorted Array:");
        for (int i = 0; i < 8; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
