package PYQ_2015;

/*

Define a class called ParkingLot with the following description:

Instance variables/data members:
int vno —     To store the vehicle number.
int hours —   To store the number of hours the vehicle is parked in the parking lot.
double bill — To store the bill amount.

Member Methods:
void input() —     To input and store the vno and hours.
void calculate() — To compute the parking charge at the rate of ₹3 for the
                   first hour or part thereof, and ₹1.50 for each additional hour or part thereof.
void display() —   To display the detail.

Write a main() method to create an object of the class and call the above methods.

 */

import java.util.Scanner;

public class Question_4_Function_Overloading
{
    int vno;
    int hours;
    double bill;

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        vno = sc.nextInt();

        System.out.print("Enter parking hours: ");
        hours = sc.nextInt();
    }

    void calculate()
    {
        if(hours<=1)
            bill *= 3;
        else
            bill = 3 + (hours - 1) * 1.5;
    }

    void display()
    {
        System.out.println("Vehicle number: " + vno);
        System.out.println("Hours: " + hours);
        System.out.println("Bill: " + bill);
    }

    public static void main(String[]args)
    {
        Question_4_Function_Overloading obj = new Question_4_Function_Overloading();

        obj.input();
        obj.calculate();
        obj.display();
    }
}
