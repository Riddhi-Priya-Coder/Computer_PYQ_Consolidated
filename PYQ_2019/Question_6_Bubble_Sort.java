package PYQ_2019;

/*

Write a program to input 15 integer elements in an array
and sort them in ascending order using the bubble sort technique.

 */

import java.util.Scanner;

public class Question_6_Bubble_Sort
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[15];

        //Input
        System.out.print("Enter 15 integers : ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        //Bubble Sort
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = 0; j < a.length - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        //Output
        System.out.println("Sorted Array : ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
