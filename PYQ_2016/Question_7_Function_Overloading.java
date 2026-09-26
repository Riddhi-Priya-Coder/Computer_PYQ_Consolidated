package PYQ_2016;

/*

Design a class to overload a function sumSeries() as follows:

(i) void sumSeries(int n, double x): with one integer argument and one
                                     double argument to find and display the sum
                                     of the series given below:

        s= x/1 - x/2 + x/3 - x/4 + x/5 ... ... ... to n terms

(ii) void sumSeries(): to find and display the sum of the following series:

        s=1+(1×2)+(1×2×3)+... ... ... +(1×2×3×4... ... ... ×20)

 */


import java.util.Scanner;

public class Question_7_Function_Overloading
{
    Scanner sc = new Scanner(System.in);

    void sumSeries(int n, double x)
    {
        System.out.print("Enter the value of integer n: ");
        n= sc.nextInt();

        System.out.print("Enter the value of double x: ");
        x= sc.nextDouble();

        double sum=0.0;

        for(int i= 1; i<=n; i++)
        {
            if(i%2==0)
                sum-=(x/i);
            else
                sum+=(x/i);
        }
        System.out.println("The sum of the series is: "+sum);
    }

    void sumSeries()
    {
        long sum=0L;

        for(int i =1; i<=20; i++)
        {
            long product = 1L;
            for(int j=1; j<=i; j++)
            {
                product *=j;
            }

            sum += product;

        }
        System.out.println("Sum of the series = "+sum);
    }

    public static void main(String[]args)
    {
        Question_7_Function_Overloading obj = new Question_7_Function_Overloading();

        obj. sumSeries(0,0.0);
        obj.sumSeries();
    }
}
