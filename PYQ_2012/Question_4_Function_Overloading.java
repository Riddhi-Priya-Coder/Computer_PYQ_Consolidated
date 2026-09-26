package PYQ_2012;

/*

Define a class called Library with the following description:

Instance Variables/Data Members:

int accNum — stores the accession number of the book.
String title — stores the title of the book.
String author — stores the name of the author.

Member methods:

void input() — To input and store the accession number, title and author.
void compute() — To accept the number of days late, calculate and display
                 the fine charged at the rate of Rs. 2 per day.
void display() — To display the details in the following format:
                    Accession Number    Title   Author

Write a main method to create an object of the class and call the above member methods.

 */

import java.util.Scanner;

public class Question_4_Function_Overloading
{
    Scanner sc = new Scanner (System.in);

    int accNum=0;
    String title="";
    String author="";

    void input()
    {
        System.out.print("Enter the accession number of the book: ");
        accNum= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the title of the book: ");
        title=sc.next();
        System.out.print("Enter the author of the book: ");
        author=sc.next();
        sc.nextLine();
    }

    void compute()
    {
        System.out.print("Enter the number of days late: ");
        int days=sc.nextInt();

        System.out.println("The amount of fine is: "+days*2);
    }

    void display()
    {
        System.out.println("Accession Number"+"\t"+"Title"+"\t"+"Author");
        System.out.println(accNum+"\t"+"\t"+"\t"+"\t"+title+"\t"+author);
    }

    public static void  main(String []args)
    {
        Question_4_Function_Overloading obj=new Question_4_Function_Overloading();
        obj.input();
        obj.compute();
        obj.display();
    }
}
