package PYQ_2011;

/*

Write a menu driven program to perform the following tasks by using Switch case statement:

(a) To print the series:
0, 3, 8, 15, 24, ............ to n terms. (value of 'n' is to be an input by the user)

(b) To find the sum of the series:
S = (1/2) + (3/4) + (5/6) + (7/8) + ........... + (19/20)

 */

import java.util.Scanner;

public class Question_9_Switch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Type 1 to print series");
        System.out.println("Type 2 to find sum of series");

        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.print("Enter the number of terms: ");
                int n = sc.nextInt();

                System.out.println("Required Series : ");
                for(int i=1; i<=n; i++)
                {
                    System.out.print(i*i-1);
                    if(i!=n)
                        System.out.print(", ");
                }
                break;

            case 2:
                double sum = 0;
                for(int i=1; i<=19; i+=2)
                {
                    System.out.print(i+"/"+(i+1));
                    if(i!=19)
                        System.out.print(" + ");
                    sum += i/((double)i+1.0);
                }
                System.out.println();
                System.out.println("Sum of the series = "+sum);
        }
    }
}
