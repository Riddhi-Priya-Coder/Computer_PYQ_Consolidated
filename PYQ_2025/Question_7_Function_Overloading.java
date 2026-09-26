package PYQ_2025;

/*

Define a class to overload the method print() as follows:
void print() – To print the given format using nested loops.
        @#@#@
        @#@#@
        @#@#@
        @#@#@

double print(double a, double b) – To display the sum of numbers
between a and b with difference of 0.5.

Example:
    if a = 1.0, b = 4.0
    Output is: 1.0 + 1.5 + 2.0 + 2.5 + … + 4.0

int print(char ch1, char ch2) – Compare the two characters and
return the ASCII code of the largest character.
 */

import java.util.Scanner;

public class Question_7_Function_Overloading
{
    double a;
    double b;
    char ch1;
    char ch2;

    Question_7_Function_Overloading()
    {
        a = 0.0;
        b = 0.0;
        ch1 = '\u0000';
        ch2 = '\u0000';
    }

    public static void main(String[] args)
    {
        Question_7_Function_Overloading obj = new Question_7_Function_Overloading();

        obj.print();
        obj.doubleprint();
        obj.intprint();
    }

    void print()
    {
        for(int i= 1; i<=5; i++)
        {
            for(int j = 1; j<=5; j++)
            {
                if(j%2==0)
                    System.out.print("# ");
                else
                    System.out.print("@ ");
            }
            System.out.println();
        }
    }

    void doubleprint()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the value of a");
        double a= sc.nextDouble();

        System.out.println("Enter the value of b");
        double b= sc.nextDouble();

        for(double i = a; i<=b; i+=0.5)
        {
            System.out.println(i+" ");
        }
        System.out.println();
    }

    void intprint()
    {
        char ch1, ch2;

    }

}
