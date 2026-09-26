package PYQ_2025;

/*

    Define a class to initialize the following data in an array.

    Search for a given character input by the user,
    using the Binary Search technique.

    Print “Search successful” if the character
    is found otherwise print “Search is not successful”.

    ‘A’, ‘H’, ‘N’, ‘P’, ‘S’, ‘U’, ‘W’, ‘Y’, ‘Z’, ‘b’, ‘d’

 */

import java.util.Scanner;

public class Question_6_Binary_Search
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = {'A', 'H', 'N', 'P', 'S', 'U', 'W', 'Y', 'Z', 'b', 'd'};

        System.out.print("Character to be searched: ");
        char ch = sc.next().charAt(0);

        int lb=0;
        int ub= arr.length - 1;
        int mid = 0;
        while(lb <= ub)
        {
            mid = (lb + ub) / 2;
            if( ch== arr[mid])
                break;
            else if(ch < arr[mid])
                ub = mid - 1;
            else
                lb = mid + 1;
        }
        if(lb > ub)
            System.out.println("Search is not successful");
        else
            System.out.println("Search is successful");
    }
}
