package PYQ_2018;

/*

Design a class to overload a function volume() as follows:

double volume (double R) – with radius (R) as an argument,
                           returns the volume of sphere using the formula.
                           V = 4/3 x 22/7 x R3

double volume (double H, double R) – with height(H) and radius(R) as the arguments,
                                     returns the volume of a cylinder using the formula.
                                     V = 22/7 x R2 x H

double volume (double L, double B, double H) – with length(L), breadth(B) and
                                               Height(H) as the arguments, returns the
                                               volume of a cuboid using the formula.
                                               V = L x B x H

 */

import java.util.Scanner;

public class Question_7_Function_Overloading
{
    double volume(double R)
    {
        return (4/3.0) * (22/7.0) * R*R*R;
    }

    double volume (double H, double R)
    {
        return (22/7.0) * R*R * H;
    }

    double volume (double L, double B, double H)
    {
        return L*B*H;
    }

    public static void main(String[]args)
    {
        Question_7_Function_Overloading obj = new Question_7_Function_Overloading();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of thr sphere : ");
        double r1 = sc.nextDouble();
        System.out.println("Volume of sphere = " + obj.volume(r1));

        System.out.println("Enter the height of the cylinder : ");
        double h1 = sc.nextDouble();
        System.out.println("Enter the radius of the cylinder : ");
        double r2 = sc.nextDouble();
        System.out.println("Volume of sphere = " + obj.volume(h1,r2));

        System.out.println("Enter the length of the cuboid : ");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the cuboid : ");
        double b = sc.nextDouble();
        System.out.println("Enter the height of the cuboid : ");
        double h2 = sc.nextDouble();
        System.out.println("Volume of sphere = " + obj.volume(l,b,h2));

    }
}
