package PYQ_2025;

/*
Define a class named CloudStorage with the following specifications:

Member Variables:
int acno – stores the user’s account number
int space – stores the amount of storage space in GB purchased by the user
double bill – stores the total price to be paid by the user

Member Methods:
void accept() – prompts the user to input their account number and storage space
                using Scanner class methods only.
void calculate() – calculates the bill total price based on the storage space purchased
                    using the pricing table provided:

    Storage range	    Price per GB (Rs)
    First 15 GB	           15
    Next 15 GB	           13
    Above 30 GB            11

void display() – displays the account number, storage space and bill to be paid.

Write a main method to create an object of the class and invoke the methods of
the class with respect to the object.

 */

import java.util.Scanner;

public class Question_3_Functions_CloudStorage
{

    //Declaration
    int space;
    int acno;
    double bill;

    Question_3_Functions_CloudStorage()
    {
        //Initialization
        acno = 0;
        space = 0;
        bill = 0.0;
    }

    public static void main(String[] args)
    {
        Question_3_Functions_CloudStorage obj = new Question_3_Functions_CloudStorage();

        obj.accept();
        obj.calculate();
        obj.display();
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number");
        acno = sc.nextInt();

        System.out.println("Enter your storage space");
        space = sc.nextInt();
    }

    void calculate()
    {
        if (space <= 15)
            bill = space * 15;
        else if (space <= 30)
            bill = (15 * 15) + ((space - 15) * 13);
        else
            bill = (15 * 15) + (15 * 13) + ((space - 30) * 11);
    }

    void display()
    {
        System.out.println("Account number: " + acno);
        System.out.println("Storage Space: " + space);
        System.out.println("Bill: Rs.  " + bill);
    }
}
