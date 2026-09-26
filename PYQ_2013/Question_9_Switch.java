package PYQ_2013;

/*

Using the switch statement, write a menu-driven program:

1. To check and display whether a number input by the user is a composite number or not.

   A number is said to be composite, if it has one or
   more than one factors excluding 1 and the number itself.

    Example: 4, 6, 8, 9...

2. To find the smallest digit of an integer that is input:
        Sample input: 6524
        Sample output: Smallest digit is 2

For an incorrect choice, an appropriate error message should be displayed.

 */

import java.util.Scanner;

public class Question_9_Switch
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1. To Check for a Composite Number");
        System.out.println("Enter 2. To find the smallest digit of an Integer");
        System.out.print("Enter your choice: ");
        int ch= sc.nextInt();

        switch (ch) {
            case 1:

                System.out.print("Enter a Number: ");
                int n = sc.nextInt();

                int c = 0;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0)
                        c++;
                }

                if (c > 0)
                    System.out.println("It is a Composite Number");
                else
                    System.out.println("It is not a Composite Number");

                break;

            case 2:

                System.out.print("Enter a Number: ");
                int n1 = sc.nextInt();

                int store = 9;

                while (n1 > 0) {
                    int d = n1 % 10;
                    if(d<store)
                        store =d;

                    n1 /= 10;
                }
                System.out.println("Smallest digit is "+store);

                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}
