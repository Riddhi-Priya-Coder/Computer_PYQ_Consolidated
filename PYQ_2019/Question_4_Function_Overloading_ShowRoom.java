package PYQ_2019;

/*
Design a class name ShowRoom with the following description:

Instance variables / Data members:
String name — To store the name of the customer
long mobno — To store the mobile number of the customer
double cost — To store the cost of the items purchased
double dis — To store the discount amount
double amount — To store the amount to be paid after discount

Member methods:
ShowRoom() — default constructor to initialize data members
void input() — To input customer name, mobile number, cost
void calculate() — To calculate discount on the cost of purchased items, based on following criteria

                Cost	                            Discount (in percentage)
Less than or equal to ₹10000	                              5%
More than ₹10000 and less than or equal to ₹20000	         10%
More than ₹20000 and less than or equal to ₹35000	         15%
More than ₹35000	                                         20%

void display() — To display customer name, mobile number, amount to be paid after discount.

Write a main method to create an object of the class and call the above member methods.
 */

import java.util.Scanner;

public class Question_4_Function_Overloading_ShowRoom
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    void ShowRoom()
    {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name: ");
        name = sc.nextLine();
        System.out.println("Enter the customer mobile number: ");
        mobno = sc.nextLong();
        System.out.println("Enter the cost: ");
        cost = sc.nextDouble();
    }

    void calculate()
    {
        if (cost <= 10000)
            cost = cost - (5 / 100.0);
        if (cost > 10000 && cost <= 20000)
            cost = cost - (10 / 100.0);
        if (cost > 20000 && cost <= 35000)
            cost = cost - (15 / 100.0);
        else
            cost = cost - (20 / 100.0);
    }

    void display()
    {
        System.out.println("The name of the customer is: " + name);
        System.out.println("Their mobile number is: " + mobno);
        System.out.println("The amount to be paid after discount: " + cost);
    }

    public static void main(String args[])
    {
        Question_4_Function_Overloading_ShowRoom obj = new Question_4_Function_Overloading_ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
