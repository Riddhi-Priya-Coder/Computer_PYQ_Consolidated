package PYQ_2025_Specimen;

/*

Define a class to search for a value input by the user from the list of values given below.
If it is found display the message "Search successful",
otherwise display the message "Search element not found",
using Binary search technique.

5.6, 11.5, 20.8, 35.4, 43.1, 52.4, 66.6, 78.9, 80.0, 95.5.
 */

import java.util.Scanner;

public class Question_4_Array_Binary_Search
{
    public static void main (String []args)
    {
        double arr[]= {5.6, 11.5, 20.8, 35.4, 43.1, 52.4, 66.6, 78.9, 80.0, 95.5};

        Scanner sc= new Scanner (System.in);

        System.out.print("Enter the number you want to search : ");
        double n= sc.nextDouble();

        int lb= 0, ub= arr.length - 1;
        int index = -1;

        while (lb <= ub)
        {
            int mid = (lb + ub) / 2;

            if (arr[mid] < n)
                lb = mid + 1;
            else if (arr[mid] > n)
                ub = mid - 1;

            else
            {
                index = mid;
                break;
            }
        }

        if(index == -1)
            System.out.println("Search element not found");
        else
            System.out.println("Search successful");
    }
}