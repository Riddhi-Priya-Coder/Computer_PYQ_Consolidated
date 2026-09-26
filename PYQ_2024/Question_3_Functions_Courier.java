package PYQ_2024;

/*
DTDC a courier company charges for the courier based on the weight of the parcel.
Define a class with the following specifications:

Class name: courier

Member variables:
name – name of the customer
weight – weight of the parcel in kilograms
address – address of the recipient
bill – amount to be paid
type – 'D'- domestic, 'I'- international

Member methods:
void accept ( ) — to accept the details using the methods of the Scanner class only.
void calculate ( ) — to calculate the bill as per the following criteria:

            Weight in Kgs	            Rate per Kg
             First 5 Kgs	              Rs.800
             Next 5 Kgs	                  Rs.700
             Above 10 Kgs	              Rs.500

An additional amount of Rs.1500 is charged if the type of the courier is I (International)

void print ( ) — To print the details
void main ( ) — to create an object of the class and invoke the methods

 */

import java.util.Scanner;

public class Question_3_Functions_Courier
{
    //Declaration
    String name;;
    double weight;
    String address;
    double bill;
    char type;

    Question_3_Functions_Courier()
    {
        //Initialization
        name = "";
        weight = 0.0;
        address = "";
        bill = 0.0;
        type= '\u0000';
    }

    public static void main(String[] args)
    {
        Question_3_Functions_Courier obj = new Question_3_Functions_Courier();

        obj.accept();
        obj.calculate();
        obj.print();
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name");
        name = sc.nextLine();

        System.out.println("Enter the weight of the package");
        weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter your address");
        address = sc.nextLine();

        System.out.println("Enter the type");
        type = sc.next().charAt(0);
    }

    void calculate()
    {
        if ( weight <= 5)
            bill = weight * 800;
        else if (weight <= 10)
            bill = (5 * 800) + (weight - 5)* 700;
        else
            bill = (5 * 800) + (5 * 700) + ((weight - 10)* 500) ;

        if(type == 'I')
            bill += 1500;
    }

    void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight +"kg");
        System.out.println("Address " + address);
        System.out.println("Bill: Rs. " + bill);
        System.out.println("Type: " + type);
    }
}