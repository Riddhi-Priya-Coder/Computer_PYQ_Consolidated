package PYQ_2023;

/*
    Define a class to accept 10 characters from a user.
    Using bubble sort technique arrange them in ascending order.
    Display the sorted array and original array.

 */

import java.util.Scanner;

public class Question_4_Array_Bubble_Sort
{
    public static void main(String []args)
    {
        int n = 5; //Optional - because size has been mentioned as 10;
        char ch[] = new char[n];


        Scanner sc = new Scanner(System.in);

        //Taking the inputs
        System.out.println("Enter 10 characters:");
        for (int i=0;  i<n; i++)
        {
            ch[i] = sc.nextLine().charAt(0);
        }

//        //Optional
//        System.out.println("Original Array : ");
//        for(int i=0;  i<n; i++)
//        {
//            System.out.print(ch[i] + " ");
//        }

        //Bubble Sort
        for (int i=0; i<n-1; i++)
        {
            for (int j=0; j<n-i-1; j++)
            {
                if (ch[j] > (ch[j + 1]))    //change  > to < for descending order
                {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }

        //Printing the sorted Array
        System.out.println("\nSorted Array");
        for(int i=0;  i<n; i++)
        {
            System.out.print(ch[i] + " ");
        }
    }
}


