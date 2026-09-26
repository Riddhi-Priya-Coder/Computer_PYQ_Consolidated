package PYQ_2010;

/*

Write a program to perform binary search on a list of integers given below,
to search for an element input by the user.
If it is found display the element along with its position,
otherwise display the message "Search element not found".

5, 7, 9, 11, 15, 20, 30, 45, 89, 97

 */

import java.util.Scanner;

public class Question_4_Binary_Search
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer to be searched: ");
        int search = sc.nextInt();

        int[] arr = {5, 7, 9, 11, 15, 20, 30, 45, 89, 97};

        int lb = 0, ub = arr.length - 1;
        int index = -1;

        while (lb <= ub)
        {
            int mid = (lb + ub) / 2;

            if (arr[mid] < search)
                lb = mid + 1;
            else if (arr[mid] > search)
                ub = mid - 1;
            else
            {
                index = mid;
                break;
            }
        }

        if (index == -1)
            System.out.println("Search element not found");
        else
            System.out.println("Record exists at index: "+index);
    }
}