package PYQ_2026;

/*

    Write a program to accept the designations of 100 employees
    in a single dimensional array. Accept the designation from the user
    and print the total number of employees with the designation
    given by the user as input.

    Example:

        Trainee	    Manager	    Chef	Manager	    Director	Manager

        Input: Manager
        Output: 3

 */

import java.util.Scanner;

public class Question_4_Array_Linear_Search
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaration of Array
        String arr[] = new String [5];

        //Input

        for(int i=0; i < arr.length; i++)
        {
            System.out.print("Enter the Designation : ");
            arr[i] = sc.next();
        }

        //Taking user choice
        System.out.println("Enter the Designation you want to search");
        String input = sc.next();


        //Searching

        int count = 0;
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i].equalsIgnoreCase(input))
                count ++;
        }

        System.out.println("Total number of employees with this designation = " + count);

    }
}
