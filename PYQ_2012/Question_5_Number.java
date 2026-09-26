package PYQ_2012;

/*

Given below is a hypothetical table showing rates of income tax
for male citizens below the age of 65 years:

        Taxable income (TI) in ₹	                         Income Tax in ₹

        Does not exceed Rs. 1,60,000                             Nil

        Is greater than Rs. 1,60,000 and
        less than or equal to Rs. 5,00,000.	               (TI - 1,60,000) x 10%

        Is greater than Rs. 5,00,000 and
        less than or equal to Rs. 8,00,000	               [(TI - 5,00,000) x 20%] + 34,000

        Is greater than Rs. 8,00,000	                   [(TI - 8,00,000) x 30%] + 94,000

Write a program to input the age, gender (male or female) and Taxable Income of a person.

If the age is more than 65 years or the gender is female, display “wrong category”.
If the age is less than or equal to 65 years and the gender is male,
compute and display the income tax payable as per the table given above.

*/

import java.util.Scanner;

public class Question_5_Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your gender: ");
        String gender=sc.nextLine();

        System.out.print("Enter your Taxable Income: ");
        double ti=sc.nextDouble();

        double tax;

        if(age<=65 && gender.equals("male"))
        {
            if (ti <= 160000)
                tax = 0;
            else if (ti <= 500000)
                tax = (ti - 160000) * 10 / 100;
            else if (ti <= 800000)
                tax = 34000 + ((ti - 500000) * 20 / 100);
            else
                tax = 94000 + ((ti - 800000) * 30 / 100);

            System.out.println("Tax Payable: " + tax);
        }

        else
            System.out.println("Wrong Category");
    }
}
