package PYQ_2010;

/*

Write a menu-driven program to accept a number from the user
and check whether it is a Prime number or an Automorphic number.

(a) Prime number: (A number is said to be prime, if it is only divisible by 1 and itself)

    Example: 3,5,7,11

(b) Automorphic number: (Automorphic number is the number which
                            is contained in the last digit(s) of its square.)

    Example: 25 is an Automorphic number as its square is 625 and 25 is present as the last two digits.

 */

import java.util.Scanner;

public class Question_7_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Prime number");
        System.out.println("2. Automorphic number");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter a number: ");
        int n= sc.nextInt();

        switch (ch)
        {
            case 1:
                int c=0;
                for(int i=1; i<=n; i++)
                {
                    if(n%i==0)
                        c++;
                }

                if(c==2)
                    System.out.println("Prime number");
                else
                    System.out.println("Not Prime number");
                break;

            case 2:
                int sq_n= n*n;

                if(sq_n % (Math.pow(10, String.valueOf(n).length())) == n)
                    System.out.println("Automorphic number");
                else
                    System.out.println("Not Automorphic number");
        }
    }
}
