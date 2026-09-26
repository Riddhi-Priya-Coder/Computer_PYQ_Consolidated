package Rev;

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

public class PRV1
{
    String name ="";
    double price=0.0;
    double net=0.0;

    public static void main(String[]args)
    {
        PRV1 obj=new PRV1();

        obj.accept();
        obj.calculate();
        obj.display();
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the item : ");
        name=sc.nextLine();
        System.out.println("Enter the price of the item : ");
        price=sc.nextDouble();
    }

    void calculate()
    {
        double dis=0.0;
        if(price>=1000 && price<=25000)
            dis= price*0.05;
        else if(price<=57000)
            dis= price*0.075;
        else if(price<=100000)
            dis= price*0.10;
        else
            dis= price*0.15;

        net= price-dis;
    }

    void display()
    {
        System.out.print("Name of the item : "+name);
        System.out.print("Net amount of the item : "+net);
    }
}
