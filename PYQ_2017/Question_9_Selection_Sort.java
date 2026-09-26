package PYQ_2017;

/*

Write a program to input forty words in an array.
Arrange these words in descending order of alphabets, using selection sort technique.
Print the sorted array.

 */

import java.util.Scanner;

public class Question_9_Selection_Sort
{
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        int n=5;
        String name[] = new String [n];

        //Input
        System.out.println("Enter the words :");
        for(int i = 0; i<name.length; i++)
        {
            name[i]= sc.nextLine();
        }

        //Selection sort
        for (int i=0; i<n-1; i++)
        {
            int idx = i;
            for (int j = i+1; j<n; j++)
            {
                if (name[idx].compareToIgnoreCase(name[j]) <0)
                    idx = j;
            }

            String temp = name[i];
            name[i] = name[idx];
            name[idx] = temp;
        }

        //Output
        System.out.println("Sorted Array :");
        for(int i = 0; i<name.length; i++)
        {
            System.out.println(name[i]);
        }

    }
}
