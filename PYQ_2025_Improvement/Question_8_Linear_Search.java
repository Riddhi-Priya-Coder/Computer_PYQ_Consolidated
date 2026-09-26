package PYQ_2025_Improvement;

/*

Define a class to accept 10 integers in an array,
search for the given value using the Bubble Search technique
and print appropriate messages.

 */

import java.util.Scanner;

public class Question_8_Linear_Search
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int n=5;
        int a[] = new int [n];

        //Input
        System.out.println("Enter the numbers : ");
        for(int i= 0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int num= sc.nextInt();


        boolean flag = false;
        for(int i=0; i<a.length; i++)
        {
            if(num == a[i])
            {
                System.out.println("Found at index = "+i);
                flag = true;
            }
        }

        if(flag == false)
            System.out.println("Not found");
    }
}
