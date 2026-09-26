package PYQ_2016;

/*

Define a class named BookFair with the following description:

Instance variables/Data members:
String Bname — stores the name of the book
double price — stores the price of the book

Member methods:
(i) BookFair() — Default constructor to initialize data members
(ii) void Input() — To input and store the name and the price of the book.
(iii) void calculate() — To calculate the price after discount.

    Discount is calculated based on the following criteria.

            Price	                                 Discount
Less than or equal to ₹1000	                        2% of price
More than ₹1000 and less than or equal to ₹3000	    10% of price
More than ₹3000	                                    15% of price

(iv) void display() — To display the name and price of the book after discount.

Write a main method to create an object of the class and call the above member methods.

 */

import java.util.Scanner;

public class Question_4_Function_Overloading
{
    String Bname;
    double price;

    void BookFair()
    {
        Bname="";
        price=0.0;
    }

    void Input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the book: ");
        Bname=sc.nextLine();

        System.out.print("Enter the price of the book: ");
        price=sc.nextDouble();
    }

    void calculate()
    {
        double dis=0.0;
        if(price<=1000)
            dis = 0.02;
        else if(price<=3000)
            dis = 0.1;
        else
            dis = 0.15;

        price -= (dis*price);
    }

    void display()
    {
        System.out.println("Book Name: " + Bname);
        System.out.println("Price after discount: " + price);
    }

    public static void main(String[]args)
    {
        Question_4_Function_Overloading obj = new Question_4_Function_Overloading();

        obj.BookFair();
        obj.Input();
        obj.calculate();
        obj.display();
    }
}