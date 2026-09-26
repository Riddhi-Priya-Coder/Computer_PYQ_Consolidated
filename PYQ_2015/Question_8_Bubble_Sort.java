package PYQ_2015;

/*

Write a program to input twenty names in an array.
Arrange these names in descending order of letters, using the bubble sort technique.

 */

import java.util.Scanner;

public class Question_8_Bubble_Sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];

        System.out.print("Enter 5 names : ");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextLine();
        }


        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) < 0)
                {
                String temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                }
            }

        }

        System.out.println("Sorted Array : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}