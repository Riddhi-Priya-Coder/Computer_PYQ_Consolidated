package PYQ_2022;

import java.util.Scanner;

/*
    Define a class to perform binary search on a list of integers given below,
    to search for an element input by the user,
    if it is found display the element along with its position,
    otherwise display the message "Search element not found".

    2, 5, 7, 10, 15, 20, 29, 30, 46, 50

 */
public class Question_2_Array_Binary_Search
{
    public static void main(String args[])
    {
        int arr[] = {2, 5, 7, 10, 15, 20, 29, 30, 46, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int n = sc.nextInt();

        //Binary Search Code
        int lb = 0, ub = arr.length - 1;
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

        if (index == -1)
            System.out.println("Search element not found");
        else
            System.out.println(n + " found at position " + index);
    }
}
