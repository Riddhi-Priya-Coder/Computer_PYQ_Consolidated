package PYQ_2025_Improvement;

/*
        Define a class with following specifications.

        class name: Hotel

        Member variables:
        String name – stores name of customer name
        long mobno – stores mobile number
        int days – stores number of days customer stayed in hotel
        int bill – stores customer bill

        Member method:
        void input() – input values using Scanner class methods only
        void charge() – calculate bill as per the following criteria

           days       	    charge/day
        first 3 days	    1000 Rs/ day
        next 4 days	        900 Rs/day
        > 7 days	        800 Rs/day

        bill = bill + gst (18% of bill)

        void print() - Display customer name, mobile number and bill.

        Invoke all the above methods in main method with the help of an object.

 */

import java.util.Scanner;

public class Question_3_Functions_Hotel
{
    //Declaration
    String name;
    long mobno;
    int days;
    double bill;

    Question_3_Functions_Hotel()
    {
        //Initialization
        name = "";
        mobno = 0L;
        days = 0;
        bill = 0.0;
    }

    public static void main(String[] args)
    {
        Question_3_Functions_Hotel obj = new Question_3_Functions_Hotel();

        obj.input();
        obj.charge();
        obj.print();
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name");
        name = sc.nextLine();

        System.out.println("Enter your mobile number");
        mobno = sc.nextLong();

        System.out.println("Enter the number of days");
        days = sc.nextInt();
    }

    void charge()
    {
        if (days <= 3)
            bill = 1000 * days;
        else if (days <= 7)
            bill = (1000 * 3) + (days -3) * 900;
        else
            bill = (1000 *3) + (900 * 4) + (days -7) * 800;
    }

    void print()
    {
        System.out.println("Customer name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Bill: Rs.  " + bill);
    }
}
