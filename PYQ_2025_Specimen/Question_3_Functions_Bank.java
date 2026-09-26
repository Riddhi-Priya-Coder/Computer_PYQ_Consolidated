package PYQ_2025_Specimen;

/*
Define a class with the following specifications:

Class name: Bank

Member variables:
double p — stores the principal amount
double n — stores the time period in years
double r — stores the rate of interest
double a — stores the amount

Member methods:
void accept () — input values for p and n using Scanner class methods only.
void calculate () — calculate the amount based on the following conditions:

            Time in (Years)	               Rate %
            Upto 1⁄2	                    9
            > 1⁄2 to 1 year	                10
            > 1 to 3 years	                11
            > 3 years	                    12

a=p*(1+r/100)^n

void display () — display the details in the given format.

Principal	Time	Rate	Amount

XXX	        XXX	    XXX	    XXX

Write the main method to create an object and call the above methods.

 */

import java.util.Scanner;

public class Question_3_Functions_Bank
{

    //Declaration
        double p;
        double n;
        double r;
        double a;

    Question_3_Functions_Bank()
    {
        //Initialization
        p = 0.0;
        n = 0.0;
        r = 0.0;
        a = 0.0;
    }

    public static void main(String[] args)
    {
        Question_3_Functions_Bank obj = new Question_3_Functions_Bank();

        obj.accept();
        obj.calculate();
        obj.display();
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your principal");
        p = sc.nextDouble();

        System.out.println("Enter the number of years");
        n = sc.nextDouble();
    }

    void calculate()
    {
        if (n<=0.5)
            r = 9;
        else if (n<= 1)
            r = 10;
        else if (n<=3)
            r = 11;
        else
            r = 12;

        a= p*Math.pow(1+(r/100),n);
    }

    void display()
    {
        System.out.println("Principal: Rs. " + p);
        System.out.println("Time: " + n);
        System.out.println("Rate: " + r);
        System.out.println("Amount: Rs. " + a);
    }
}
