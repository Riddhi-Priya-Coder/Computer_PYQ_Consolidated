package PYQ_2019;

/*

Using the switch-case statement, write a menu driven program to do the following:

(a) To generate and print Letters from A to Z and their Unicode

      Letters     	  Unicode
        A	            65
        B	            66
        .	            .
        .	            .
        .	            .
        Z	            90

(b) Display the following pattern using iteration (looping) statement:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

import java.util.Scanner;

public class Question_5_Switch_Case
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for letters and Unicode.");
        System.out.println("Enter 2 to display the pattern.");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("Letters" + "\t"+"\t" + "Unicode");

                for (int i = 65; i <= 90; i++)
                    System.out.println((char) i + "\t"+"\t"+"\t"+"\t" + i);
                break;

            case 2:
                for (int i = 1; i <= 5; i++)
                {
                    for (int j = 1; j <= i; j++)
                    {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
        }
    }
}
