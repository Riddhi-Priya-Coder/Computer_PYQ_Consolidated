package PYQ_2017;

/*

Write a program to input integer elements
into an array of size 20 and perform the following operations:

1. Display the largest number from the array.
2. Display the smallest number from the array.
3. Display sum of all the elements of the array.

 */

import java.util.Scanner;

public class Question_7_Array
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);

        int arr[]= new int[20];

        System.out.print("Enter an array of size 20: ");

        for(int i=0; i<20; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max=arr[0], min=arr[0], sum=0;

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }

            if(arr[i] < min)
            {
                min = arr[i];
            }

            sum+=arr[i];
        }

        System.out.println("The Largest Number is: "+max);
        System.out.println("The Smallest Number is: "+min);
        System.out.println("The Sum is: "+sum);
    }
}
