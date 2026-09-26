package PYQ_2025_Specimen;

/*

Define a class to overload the method display() as follows:

void display(): To print the following format using nested loop.

    1 2 1 2 1
    1 2 1 2 1
    1 2 1 2 1

void display (int n, int m) :

    To print the quotient of the division of m and n if m is greater than n
    otherwise print the sum of twice n and thrice m.

double display (double a, double b, double c) — to print the value of z where

        z = p × q
        p = (a + b)/c
        q = a + b + c
 */

import java.util.Scanner;

public class Question_8_Function_Overloading
{
    public static void main(String[] args)
    {
        Question_8_Function_Overloading obj = new Question_8_Function_Overloading();

        Scanner sc = new Scanner(System.in);

        obj.display();

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m : ");
        int m = sc.nextInt();
        obj.display(n, m);

        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();

        double z = obj.display(a, b, c);
        System.out.println("z = " + z);
    }

    void display()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (j % 2 == 0)
                    System.out.print(" 2 ");
                else
                    System.out.print(" 1 ");
            }
            System.out.println();
        }
    }

    void display(int n, int m)
    {
        if (m > n)
            System.out.println("quotient = "+m/n);
        else
            System.out.println("Sum = "+ (2*n+3*m));

    }

    double display(double a, double b, double c)
    {
        double p = (a + b) / c;
        double q = a + b + c;

        return p*q;

    }
}
