package PYQ_2011;

/*

Write a program to input and sort the weight of ten people.
Sort and display them in descending order using the selection sort technique.

 */

import java.util.Scanner;

public class Question_5_Selection_Sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[]= new int[10];

        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<10-1; i++)
        {
            int max = i;
            for (int j = i+1; j<10; j++)
            {
                if(arr[j] > arr[max])
                {
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        System.out.println("Sorted Array :");
        for(int i = 0; i<10; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
