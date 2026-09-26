package PYQ_2018;

/*

Design a class RailwayTicket with following description:

Instance variables/data members:
String name — To store the name of the customer
String coach — To store the type of coach customer wants to travel
long mobno — To store customer’s mobile number
int amt — To store basic amount of ticket
int totalamt — To store the amount to be paid after updating the original amount

Member methods:
void accept() — To take input for name, coach, mobile number and amount.
void update() — To update the amount as per the coach selected
                (extra amount to be added in the amount as follows)

        Type of Coaches	          Amount
            First_AC	            700
            Second_AC	            500
            Third_AC	            250
            sleeper	               None

void display() — To display all details of a customer such
                    as name, coach, total amount and mobile number.

Write a main method to create an object of the class and call the above member methods.

 */

import java.util.Scanner;

public class Question_4_Function_Overloading_Railway_Ticket
{

    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter coach: ");
        coach = sc.nextLine();
        System.out.print("Enter mobile no: ");
        mobno = sc.nextLong();
        System.out.print("Enter amount: ");
        amt = sc.nextInt();
    }

    void update()
    {
        if(coach == "First_AC")
            totalamt= amt+700;
        else if(coach == "Second_AC")
            totalamt= amt+500;
        else if(coach == "Third_AC")
            totalamt= amt+250;
        else
            totalamt= amt;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Total Amount: " + totalamt);
        System.out.println("Mobile number: " + mobno);
    }

    public static void main(String[]args)
    {
        Question_4_Function_Overloading_Railway_Ticket obj = new Question_4_Function_Overloading_Railway_Ticket();
        obj.accept();
        obj.display();
        obj.update();
    }
}
