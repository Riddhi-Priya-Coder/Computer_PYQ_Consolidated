package PYQ_2016;

/*

Using the switch statement, write a menu-driven program for the following:

(i) To print the Floyd’s triangle [Given below]

1
2   3
4   5   6
7   8   9   10
11  12  13  14  15

(b) To display the following pattern:

I
I C
I C S
I C S E

For an incorrect option, an appropriate error message should be displayed.

*/

import java.util.Scanner;

public class Question_5_Switch_Case
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to display the Floyd's Triangle");
        System.out.println("Enter 2 to display the ICSE pattern");
        System.out.println("Please enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                for(int i= 1; i<=15; i++)
                {
                    for(int j= 1; j<=i; j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                String str = "ICSE";
                int j;

                for(int i =0; i<str.length(); i++)
                {
                    for(j =0; j<=i; j++)
                    {
                        System.out.print(str.charAt(j)+" ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Option");
        }
    }
}