package PYQ_2011;

/*

Define a class called 'Mo-bike' with the following specifications:

Data Members	            Purpose
int bno	            To store the bike number
int phno	        To store the phone number of the customer
String name	        To store the name of the customer
int days	        To store the number of days the bike is taken on rent
int charge	        To calculate and store the rental charge

Member Methods	            Purpose
void input()	    To input and store the details of the customer
void compute()	    To compute the rental charge
void display()	    To display the details in the given format

The rent for a mo-bike is charged on the following basis:

             Days	               Charge
        For first five days	    ₹500 per day
        For next five days	    ₹400 per day
        Rest of the days	    ₹200 per day

Output:

Bike No.    Phone No.   Name    No. of days     Charge
xxxxxxx     xxxxxxxx    xxxx        xxx         xxxxxx

 */

import java.util.Scanner;

public class Question_4_Function_Overloading
{
    int bno;
    long phno;
    String name;
    int days;
    int charge;

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bike number: ");
        bno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your phone number: ");
        phno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.print("Enter your days: ");
        days = sc.nextInt();
    }

    void compute()
    {
        if(days <= 5)
            charge = days * 500;
        else if(days <= 10)
            charge = (500 * 5) + (days - 5) * 400;
        else
            charge = (500 * 5) + (400 * 5) + (days - 10) * 200;
    }

    void display()
    {
        System.out.println("Bike No."+"\t"+ "Phone No."+"\t"+ "Name"+"\t"+ "No. of days"+"\t"+ "Charge");
        System.out.println(bno + "\t"+"\t"+"\t" + phno + "\t"+"\t" + name + "\t"+"\t" + charge);
    }

    public static void main(String[]args)
    {
        Question_4_Function_Overloading obj = new Question_4_Function_Overloading();
        obj.input();
        obj.compute();
        obj.display();
    }
}

