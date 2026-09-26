package PYQ_2024_Specimen;

/*

Define a class to overload the method display as follows:

void display( ): To print the following format using nested loop

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

void display(int n): To print the square root of each digit of the given number.

Example:
        n = 4329
        Output –
        3.0
        1.414213562
        1.732050808
        2.0
 */

import java.util.Scanner;

public class Question_8_Function_Overloading
{
    public static void main (String []args)
    {
        Question_8_Function_Overloading obj = new Question_8_Function_Overloading();

        Scanner sc = new Scanner (System.in);

        System.out.println("Pattern: ");
        obj.display();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        obj.display(n);
    }


    void display()
    {
        for(int i= 1; i<=5; i++)
        {
            for(int j= 1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void display(int n)
    {
        while(n>0)
        {
            double d= n%10;
            System.out.println(Math.sqrt(d));
            n/=10;
        }
    }
}
