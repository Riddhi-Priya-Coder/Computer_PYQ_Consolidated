package PYQ_2013;

/*

Design a class to overload a function series( ) as follows:

double series(double n) with one double argument and returns the sum of the series.
sum = (1/1) + (1/2) + (1/3) + .......... + (1/n)

double series(double a, double n) with two double arguments and returns the sum of the series.
sum = (1/a2) + (4/a5) + (7/a8) + (10/a11) + .......... to n terms

 */

import java.util.Scanner;

public class Question_8_Function_Overload
{
    public static void main(String[]args)
    {
        Question_8_Function_Overload obj = new Question_8_Function_Overload();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        double n= sc.nextInt();
        System.out.println("Sum = "+obj.series(n));


        System.out.print("Enter the number of terms: ");
        double n1= sc.nextInt();
        System.out.print("Enter the value of a: ");
        double a= sc.nextInt();
        System.out.println("Sum = "+obj.series(a, n1));
    }

    double series (double n)
    {
        double sum=0.0;

        for(double i = 1; i <= n; i++)
        {
            sum+=(1.0/i);
        }

        return sum;
    }

    double series(double a, double n1)
    {
        double sum=0.0;
        int num=1;

        for( int i= 1; i<=n1; i++)
        {

                sum+= num/(Math.pow(a,(num+1)));
                num += 3;

        }
        return sum;
    }
}
