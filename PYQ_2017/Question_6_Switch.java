package PYQ_2017;

/*

Using switch statement, write a menu-driven program for the following:

1. To find and display the sum of the series given below:
   S = x1 - x2 + x3 - x4 + x5 .......... - x20
   (where x = 2)

2. To display the following series:
   1 11 111 1111 11111

For an incorrect option, an appropriate error message should be displayed.

 */

import java.util.Scanner;

public class Question_6_Switch
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1 to Sum of the series");
        System.out.println("Enter 2 to Display the series");
        System.out.print("Please enter your choice: ");
        int ch= sc.nextInt();

        switch (ch)
        {
            case 1 :
                double x = 2.0;
                double sum= 0;
                for(int i=1; i <=20; i++)
                {
                    if(i%2==0)
                        sum-=Math.pow(x,i);
                    else
                        sum+=Math.pow(x,i);
                }
                System.out.print("The sum is: "+sum);
                break;

            case 2 :
                int term=1;
                for(int i = 1; i<=5; i++)
                {
                    System.out.print(term+" ");
                    term = term * 10 + 1;
                }
                break;

            default:
                System.out.println("Invalid Option chosen");
        }
    }
}
