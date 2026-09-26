package PYQ_2023;
/*
    Define a class to accept values into an array of double data type
    of size 20. Accept a double value from user
    and search in the array using linear search method.

    If value is found display message "Found" with
    its position where it is present in the array.
    Otherwise, display message "not found".

*/

import java.util.Scanner;
class Question_7_Array_Linear_Search
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int n = 5; //optional
        double arr[] = new double[n];

        //Taking input
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextDouble();
        }

        System.out.print("Enter the number to search: ");
        double ele = sc.nextDouble();

        boolean flag = false;

        for (int i=0; i<n; i++)
        {
            if (arr[i] == ele)
            {
                flag = true;
                System.out.println(ele + " found at index " + i);
                System.out.println(ele + " found at position " + (i+1));
            }
        }

        if (!flag)
        {
            System.out.println("Not found");
        }
    }
}
