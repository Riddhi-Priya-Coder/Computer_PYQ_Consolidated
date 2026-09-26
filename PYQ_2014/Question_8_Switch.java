package PYQ_2014;

/*

Using the switch statement, write a menu-driven program to calculate
the maturity amount of a Bank Deposit.

The user is given the following options:

1. Term Deposit
2. Recurring Deposit

For option 1,
        accept principal (P), rate of interest(r) and time period in years(n).
        Calculate and output the maturity amount(A) receivable using the formula:

        A = P[1 + r / 100]n

For option 2,
        accept Monthly Installment (P), rate of interest (r) and time period in months (n).
        Calculate and output the maturity amount (A) receivable using the formula:

        A = P x n + P x (n(n+1) / 2) x r / 100 x 1 / 12

For an incorrect option, an appropriate error message should be displayed.

 */

import java.util.Scanner;

public class Question_8_Switch
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 for Term Deposit");
        System.out.println("Type 2 for Recurring Deposit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch)
        {
            case 1:

                System.out.print("Enter Principal: ");
                double p = sc.nextDouble();
                System.out.print("Enter Interest Rate: ");
                double r = sc.nextDouble();
                System.out.print("Enter time in years: ");
                int n = sc.nextInt();

                double a = p * Math.pow((1 + r / 100.0), n);
                System.out.println(a);
                break;

            case 2:

                System.out.print("Enter Monthly Installment: ");
                double p1 = sc.nextDouble();
                System.out.print("Enter Interest Rate: ");
                double r1 = sc.nextDouble();
                System.out.print("Enter time in months: ");
                int n1 = sc.nextInt();

                double A = p1 * n1 + p1 * ((double) (n1 * (n1 + 1)) / 2) * r1 / 100 * 1 / 12;
                System.out.println(A);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}