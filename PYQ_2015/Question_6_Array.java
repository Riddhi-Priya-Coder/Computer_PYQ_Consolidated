package PYQ_2015;

/*

Write a program to input and store roll numbers,
names and marks in 3 subjects of n number of students
in five single dimensional arrays and display the remark
based on average marks as given below:

        Average Marks	        Remark
        85 — 100	            Excellent
        75 — 84	                Distinction
        60 — 74	                First Class
        40 — 59	                Pass
        Less than 40	        Poor

 */

import java.util.Scanner;

public class Question_6_Array
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n= sc.nextInt();

        //Array declaration
        int roll[] = new int [n];
        String name[] = new String [n];
        double s1[] = new double [n];
        double s2[] = new double [n];
        double s3[] = new double [n];

        //Input
        for(int i=0; i<n; i++)
        {

            System.out.print("Enter your roll no.: ");
            roll[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter your name: ");
            name[i] = sc.nextLine();

            System.out.print("Subject 1 Marks: ");
            s1[i] = sc.nextDouble();

            System.out.print("Subject 2 Marks: ");
            s2[i] = sc.nextDouble();

            System.out.print("Subject 3 Marks: ");
            s3[i] = sc.nextDouble();
        }

        //Calculation
        System.out.println("****** Result ********");
        String remark="";
        for(int i=0; i<n; i++)
        {
            double avg = (s1[i] + s2[i] + s3[i]) / 3.0;
            if (avg >= 85)
                remark = "Excellent";
            else if (avg >= 75)
                remark = "Distinction";
            else if (avg >= 60)
                remark = "First Class";
            else if (avg >= 40)
                remark = "Pass";
            else
                remark = "Poor";

            System.out.println("Roll no. : "+roll[i] +" Name : "+name[i]+" Remark : "+remark);
        }
    }
}
