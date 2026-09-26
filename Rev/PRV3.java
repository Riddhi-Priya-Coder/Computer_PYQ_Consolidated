package Rev;

/*

Write a program to accept 10 different integers in a single dimensional array.
Now, enter an integer and search whether the number is present or not in the list of array
elements by using Bubble search technique. If found, display " Search Successful "
otherwise display the message "Search Unsuccessful, No such number in the list ".

 */

import java.util.Scanner;

public class PRV3
{
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search: ");
        int n = sc.nextInt();

        int c = 0;

        for (int i = 0; i < 10; i++)
        {
            if (arr[i] == n)
                System.out.println(n);
                c++;
        }

        if (c > 0)
            System.out.println("Search Successful");
        else
            System.out.println("Search Unsuccessful, No such number in the list");
    }
}
