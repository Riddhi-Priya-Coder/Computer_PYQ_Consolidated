package PYQ_2025_Improvement;

/*

Define a class to overload the method transform as follows:

int transform(int n) –
            to return the sum of the digits of the given number

    Example: n = 458
    output : 17

void transform(String s) –
            to convert the given String to upper case and print

    Example: if S = “Blue”
    Output : BLUE

void transform (char ch) –
            to print the character ch in 3 rows and 3 columns using nested loops.

    Example: if ch = ‘@’
    Output :
                @@@
                @@@
                @@@

 */

import java.util.Scanner;

public class Question_5_Overloading
{
    public static void main(String []args)
    {
        Question_5_Overloading obj = new Question_5_Overloading();

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of n: ");
        int n= sc.nextInt();
        sc.nextLine();

        obj.transform(n);

        System.out.print("Enter the value of s: ");
        String s= sc.nextLine();
        obj.transform(s);

        System.out.print("Enter the value of ch: ");
        char ch = sc.next().charAt(0);
        obj.transform(ch);
    }

    void transform(int n)
    {
        int sum = 0;
        while (n>0)
        {
            int d= n%10;
            sum+=d;
            n/=10;
        }
        System.out.println(sum);
    }

    void transform(String s)
    {
        s=s.toUpperCase();
        System.out.println(s);
    }

    void transform(char ch)
    {
        for(int i= 0; i<3; i++)
        {
            for(int j= 0; j<3; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
