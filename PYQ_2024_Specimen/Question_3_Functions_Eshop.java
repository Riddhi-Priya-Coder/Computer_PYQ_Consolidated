package PYQ_2024_Specimen;

/*
Define a class called with the following specifications:

Class name: Eshop

Member variables:
String name: name of the item purchased
double price: Price of the item purchased

Member methods:
void accept(): Accept the name and the price of the item using the methods of Scanner class.
void calculate(): To calculate the net amount to be paid by a customer,
based on the following criteria:

            Price	                Discount
            1000 – 25000	        5.0%
            25001 – 57000	        7.5 %
            57001 – 100000	        10.0%
            More than 100000	    15.0 %

void display(): To display the name of the item and the net amount to be paid.

Write the main method to create an object and call the above methods.

 */

import java.util.Scanner;

public class Question_3_Functions_Eshop
{
    //Declaration
    String name;
    double price;
    double netamt;
    double discount;

    Question_3_Functions_Eshop()
    {
        //Initialization
        name = "";
        price = 0.0;
        netamt = 0.0;
    }

    public static void main(String[] args)
    {
        Question_3_Functions_Eshop obj = new Question_3_Functions_Eshop();

        obj.accept();
        obj.calculate();
        obj.display();
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the item");
        name = sc.nextLine();

        System.out.println("Enter the price of the item");
        price = sc.nextDouble();
    }

    void calculate()
    {
        if (price <= 25000)
            discount = 0.05;
        else if (price <= 57000)
            discount = 0.075;
        else if (price <= 100000)
            discount = 0.1;
        else
            discount = 0.15;

        netamt = price * (1-discount);
    }

    void display()
    {
        System.out.println("Item name: " + name);
        System.out.println("Net Amount: Rs.  " + netamt);
    }
}
