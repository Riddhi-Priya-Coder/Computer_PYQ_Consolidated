package PYQ_2013;

/*

Define a class named FruitJuice with the following description:

    Data Members	                                Purpose
    int product_code	        stores the product code number
    String flavor               stores the flavor of the juice (e.g., orange, apple, etc.)
    String pack_type	        stores the type of packaging (e.g., tera-pack, PET bottle, etc.)
    int pack_size	            stores package size (e.g., 200 mL, 400 mL, etc.)
    int product_price	        stores the price of the product

    Member Methods	                                Purpose
    FruitJuice()	            constructor to initialize integer data members to 0 and
                                string data members to ""
    void input()	            to input and store the product code, flavor, pack type,
                                pack size and product price
    void discount()	            to reduce the product price by 10
    void display()	            to display the product code, flavor, pack type, pack size
                                and product price

 */

import java.util.Scanner;

public class Question_4_Function_Overloading
{
    Scanner sc = new Scanner(System.in);

    int product_code;
    String flavor;
    String pack_type;
    int pack_size;
    int product_price;

    void FruitJuice()
    {
        product_code = 0;
        flavor = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }

    void input()
    {
        System.out.print("Enter the product code: ");
        product_code = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Flavour: ");
        flavor = sc.nextLine();

        System.out.print("Enter Pack Type: ");
        pack_type = sc.nextLine();

        System.out.print("Enter Pack Size: ");
        pack_size = sc.nextInt();

        System.out.print("Enter Product Price: ");
        product_price = sc.nextInt();
    }

    void discount()
    {
        product_price -= 10;
    }

    void display()
    {
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavour: " + flavor);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size);
        System.out.println("Product Price: " + product_price);
    }

    public static void main(String[] args)
    {
        Question_4_Function_Overloading obj = new Question_4_Function_Overloading();

        obj.FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}