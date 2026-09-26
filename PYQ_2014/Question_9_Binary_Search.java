package PYQ_2014;

/*

Write a program to accept the year of graduation from school as an integer value from the user.
Using the binary search technique on the sorted array of integers given below,
output the message "Record exists" if the value input is located in the array.
If not, output the message "Record does not exist".

Sample Input:

n[0]	n[1]	n[2]	n[3]	n[4]	n[5]	n[6]	n[7]	n[8]	n[9]
1982	1987	1993	1996	1999	2003	2006	2007	2009	2010

 */

import java.util.Scanner;

public class Question_9_Binary_Search
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Year of graduation: ");
        int grad = sc.nextInt();

        int[] arr = {1982, 1987 ,1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};

        int lb = 0, ub = arr.length - 1;
        int index = -1;

        while (lb <= ub)
        {
            int mid = (lb + ub) / 2;

            if (arr[mid] < grad)
                lb = mid + 1;
            else if (arr[mid] > grad)
                ub = mid - 1;

            else
            {
                index = mid;
                break;
            }

        }

        if (index == -1)
            System.out.println("Record does not exist");
        else
            System.out.println("Record exists");
    }
}
