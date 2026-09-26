package Rev;

/*

Design a class to overload the method volume( ) as follows :

(i) double volume (double R) - with radius (R) as an argument, returns the
                               volume of sphere using the formula.
                               V = 4/3 x 22/7 x R3

(ii) double volume (double H, double R) - with height8-9=0-(H) and radius(R) as the
                        arguments, returns the volume of a cylinder using the formula.
                        V = 22/7 x R2 x H

(iii) double volume (double L, double B, double H) - with length(L), breadth(B),
                        Height(H) as the arguments,returns the volume of a cuboid using the formula.
                        V = L * B * H;

 */

import java.util.Scanner;

public class PRV2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PRV2 obj = new PRV2();

        System.out.println("Enter the Radius: ");
        double R= sc.nextDouble();
        System.out.println(obj.volume(R));

        System.out.println("Enter the Height: ");
        double H= sc.nextDouble();
        System.out.println("Enter the Radius: ");
        double R1= sc.nextDouble();
        System.out.println(obj.volume(H,R1));

        System.out.println("Enter the Length: ");
        double L= sc.nextDouble();
        System.out.println("Enter the Breadth: ");
        double B= sc.nextDouble();
        System.out.println("Enter the Height: ");
        double H2= sc.nextDouble();
        System.out.println(obj.volume(L,B,H2));
    }

    double volume(double R)
    {
        double V = (4/3.0) * (22/7.0) * (Math.pow(R,3));
        return V;
    }

    double volume(double H, double R1)
    {
        double V= (22/7.0) * (Math.pow(R1,2)) * H;
        return V;
    }

    double volume(double L, double B, double H2)
    {
        double V= L*B*H2;
        return V;
    }
}
