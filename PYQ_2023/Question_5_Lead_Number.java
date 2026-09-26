package PYQ_2023;

/*
Define a class to overload the function print as follows:

void print() - to print the following format

        1  1  1  1
        2  2  2  2
        3  3  3  3
        4  4  4  4
        5  5  5  5

void print(int n) - To check whether the number is a lead number.

A lead number is the one whose sum of even digits are equal to sum of odd digits.

    e.g. 3669
    odd digits sum = 3 + 9 = 12
    even digits sum = 6 + 6 = 12
    3669 is a lead number.

 */

import java.util.Scanner;

public class Question_5_Lead_Number
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        Question_5_Lead_Number obj = new Question_5_Lead_Number();

        obj.print();
        obj.print(n);
    }

    void print()
    {
        for(int i= 1; i<=5; i++)
        {
            for(int j= 1; j<=5; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }

    void print(int n)
    {
        int sum_even=0, sum_odd=0;

        while(n>0)
        {
            int d = n%10;
            if(d%2==0)
                sum_even += d;
            else
                sum_odd +=d;

            n /= 10;
        }

        if(sum_even == sum_odd)
            System.out.println("It is a lead number");
        else
            System.out.println("It's not a lead number");
    }
}
