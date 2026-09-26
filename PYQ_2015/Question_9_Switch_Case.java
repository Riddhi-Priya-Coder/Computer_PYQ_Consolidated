package PYQ_2015;

/*

Using switch statement, write a menu-driven program to:

(i) To find and display all the factors of a number input
    by the user ( including 1 and the excluding the number itself).

    Example:
    Sample Input : n = 15
    Sample Output : 1, 3, 5

(ii) To find and display the factorial of a number input
     by the user (the factorial of a non-negative integer n,
     denoted by n!, is the product of all integers less than or equal to n)

     Example:
     Sample Input : n = 5
     Sample Output : 5! = 1*2*3*4*5 = 120

For an incorrect choice, an appropriate error message should be displayed.

 */

import java.util.Scanner;

public class Question_9_Switch_Case
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1. Factors of number");
        System.out.println("Enter 2. Factorial of number");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch)
        {
            case 1:

                System.out.print("Enter a number whose factors are to be printed: ");
                int num= sc.nextInt();

                for(int i=1; i<num; i++)
                {
                    if(num%i==0)
                        System.out.println("The factors are: "+i);
                }

                break;

            case 2:

                System.out.print("Enter a number whose factorials are to be printed: ");
                int n= sc.nextInt();

                int prod=1;

                for(int i=1; i<=n; i++)
                {
                    if(n%i==0)
                        prod*=i;
                }
                System.out.println("The factorials are: "+prod);

                break;

            default:
                System.out.println("Invalid Option chosen");
        }
    }
}
