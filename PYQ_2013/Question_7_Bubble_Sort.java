package PYQ_2013;

/*

Write a program to input 10 integer elements in an array
and sort them in descending order using bubble sort technique.

 */

import java.util.Scanner;

public class Question_7_Bubble_Sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");

        int arr[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] < arr[j + 1])   // Descending order
                {
                    int term = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = term;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
