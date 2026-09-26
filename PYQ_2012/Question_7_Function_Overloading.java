package PYQ_2012;

/*

Design a class to overload a function polygon() as follows:

1. void polygon(int n, char ch) — with one integer and one character type argument
                                  to draw a filled square of side n using the character stored in ch.

2. void polygon(int x, int y) — with two integer arguments that draws a filled rectangle of length x
                                and breadth y, using the symbol '@'.

3. void polygon() — with no argument that draws a filled triangle shown below:

    Example:

            Input value of n=2, ch = 'O'

            Output:
            OO
            OO

            Input value of x = 2, y = 5

            Output:
            @@@@@
            @@@@@

            Output:
            *
            **
            ***

 */

import java.util.Scanner;

public class Question_7_Function_Overloading
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        Question_7_Function_Overloading obj=new Question_7_Function_Overloading();

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0);
        obj.polygon(n,ch);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        System.out.print("Enter another integer: ");
        int y = sc.nextInt();
        obj.polygon(x,y);

        obj.polygon();
    }

    void polygon(int n, char ch)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void polygon(int x, int y)
    {
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    void polygon()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
