package PYQ_2014;

/*

Design a class to overload a function area( ) as follows:

double area (double ann, double b, double c) with three double arguments,
returns the area of a scalene triangle using the formula:
                area = √(s(s-a)(s-b)(s-c))

where s = (a+b+c) / 2

double area (int na, int b, int height) with three integer arguments,
returns the area of a trapezium using the formula:
                area = (1/2)height(a + b)

double area (double diagonal1, double diagonal2) with two double arguments,
returns the area of a rhombus using the formula:
                area = 1/2(diagonal1 x diagonal2)

 */

import java.util.Scanner;

public class Question_7_Function_Overloading
{
    double area(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        double x= s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(x);
    }

    double area(int a1, int b1, int height)
    {
        return 0.5*height*(a1 + b1);
    }

    double area(double diagonal1, double diagonal2)
    {
        return 0.5*(diagonal1*diagonal2);
    }

    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);

        Question_7_Function_Overloading obj = new Question_7_Function_Overloading();

        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble();

        obj.area(a,b,c);

        System.out.println("Enter the value of a: ");
        int a1 = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b1 = sc.nextInt();

        System.out.println("Enter the value of height: ");
        int height = sc.nextInt();

        obj.area(a1,b1,height);

        System.out.println("Enter the value of diagonal1: ");
        double diagonal1 = sc.nextDouble();

        System.out.println("Enter the value of diagonal2: ");
        double diagonal2 = sc.nextDouble();

        obj.area(diagonal1,diagonal2);

        System.out.println("Area of Scalene Triangle = " + obj.area(a,b,c));

        System.out.println("Area of Trapezium = " + obj.area(a1,b1,height));

        System.out.println("Area of Rhombus = " + obj.area(diagonal1,diagonal2));

    }

}
