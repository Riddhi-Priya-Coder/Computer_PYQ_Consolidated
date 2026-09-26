package PYQ_2018;

/*

Write a menu driven program to display the pattern as per user’s choice.

Pattern 1:

            ABCDE
            ABCD
            ABC
            AB
            A

Pattern 2:

            B
            LL
            UUU
            EEEE

For an incorrect option, an appropriate error message should be displayed.
 */

import java.util.Scanner;

public class Question_8_Switch_Case
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for pattern 1");
        System.out.println("Enter 2 for Pattern 2");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                for(int i= 69; i>=65; i--)
                {
                    for(int j= 65; j<=i; j++)
                    {
                        System.out.print((char)j);
                    }
                    System.out.println();
                }
                break;

            case 2:
                String word="BLUE";
                for(int i=0;i<word.length();i++)
                {
                    for(int j=0; j<=i; j++)
                    {
                        char ch = word.charAt(i);
                        System.out.print(ch);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
