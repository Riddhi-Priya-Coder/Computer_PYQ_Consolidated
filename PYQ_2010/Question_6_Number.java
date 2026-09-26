package PYQ_2010;

/*

Shasha Travels Pvt. Ltd. gives the following discount to its customers:

            Ticket                      Amount Discount
        Above Rs. 70000	                    18%
        Rs. 55001 to Rs. 70000	            16%
        Rs. 35001 to Rs. 55000	            12%
        Rs. 25001 to Rs. 35000	            10%
        Less than Rs. 25001	                 2%

Write a program to input the name and ticket amount for the customer
and calculate the discount amount and net amount to be paid.

Display the output in the following format for each customer:

Sl. No.     Name    Ticket Charges     Discount      Net Amount

(Assume that there are 15 customers,
first customer is given the serial no (SI. No.) 1, next customer 2 …….. and so on)

 */

import java.util.Scanner;

public class Question_6_Number
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        String []name = new String[15];
        double []amt = new double[15];

        for (int i = 0; i < 15; i++)
        {
            System.out.print("Enter Customer " + (i + 1) + " Name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter Customer " + (i + 1) + " Ticket Charges: ");
            amt[i] = sc.nextInt();
            sc.nextLine();
        }


        double dis;
        double dis_amt;
        double net_amt;

        System.out.println("Sl. No."+"\t"+"Name"+"\t\t"+"Ticket Charges"+"\t"+"Discount"+"\t\t"+"Net Amount");

        for (int i = 0; i < 15; i++)
        {
            if (amt[i] > 70000)
                dis = 18;
            else if (amt[i] >= 55001)
                dis = 16;
            else if (amt[i] >= 35001)
                dis = 12;
            else if (amt[i] >= 25001)
                dis = 10;
            else
                dis = 2;

            dis_amt = (amt[i] * dis) / 100.0;
            net_amt = amt[i] - dis_amt;

            System.out.println((i+1) + "\t" + name[i] + "\t" + amt[i] + "\t\t" + dis_amt + "\t\t" + net_amt);
        }
    }
}
