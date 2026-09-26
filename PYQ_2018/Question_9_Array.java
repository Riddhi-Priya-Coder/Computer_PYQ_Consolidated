package PYQ_2018;

/*

Write a program to accept name and total marks of N number
of students in two single subscript array name[] and totalmarks[].

Calculate and print:

The average of the total marks obtained by N number of students.
[average = (sum of total marks of all the students)/N]
Deviation of each student’s total marks with the average.
[deviation = total marks of a student – average]
 */

import java.util.Scanner;

public class Question_9_Array
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int N= sc.nextInt();
        sc.nextLine();

        String name[] = new String [N];
        double totalmarks[] = new double [N];

        //Input
        for(int i=0; i<N; i++)
        {
            System.out.print("Enter your name: ");
            name[i]= sc.nextLine();

            System.out.print("Enter your marks: ");
            totalmarks[i] = sc.nextDouble();
            sc.nextLine();
        }

        //Finding average
        double sum =0.0;
        for(int i=0; i<N; i++) {
            sum += totalmarks[i];
        }
        double avg = sum/N;
        System.out.println("Average = "+avg);

        //Deviation of each student’s total marks with the average.
        for(int i=0; i<N; i++)
        {
            System.out.println("Deviation for "+name[i]+" = "+(totalmarks[i]-avg));
        }
    }
}
