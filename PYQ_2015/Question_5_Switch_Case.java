package PYQ_2015;

/*

Write two separate programs to generate the following patterns using iteration (loop) statements:

(a)

*
*  #
*  #  *
*  #  *  #
*  #  *  #  *

(b)

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

 */

import java.util.Scanner;

public class Question_5_Switch_Case
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to display the Characters Triangle");
        System.out.println("Enter 2 to display the series");
        System.out.println("Please enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                for(int i = 1; i <= 5; i++)
                {
                    for(int j = 1; j <= i; j++)
                    {
                        if(j % 2 == 1)
                            System.out.print("* ");
                        else
                            System.out.print("# ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for(int i = 5; i >= 1; i--)
                {
                    for(int j = 5; j >= 6 - i; j--)
                    {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Option");
        }
    }
}
