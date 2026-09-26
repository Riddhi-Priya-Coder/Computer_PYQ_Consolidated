package Unit_Test_1;

import java.util.Scanner;

public class Function_Overload
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Function_Overload obj = new Function_Overload();


        //First part
        System.out.println("Enter the first integer");
        int a = sc.nextInt();
        System.out.println("Enter the second integer");
        int b = sc.nextInt();

        int m = obj.perform(a,b);
        System.out.println(m + " is the greater value");


        //second part
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        obj.perform(n,ch);

        //third part
        System.out.println("Enter the integer value");
        int n1 = sc.nextInt();
        System.out.println("Enter the double value");
        double x = sc.nextDouble();

        double sum = obj.perform(n1,x);
        System.out.println("Sum of the series = "+sum);
    }

    int perform(int a, int b)
    {
        return (a>b)?a:b;
    }

    void perform(int n, char ch)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    double perform(int n, double x)
    {
        double sum = 0.0;
        for(int i=1; i<=n; i++)
        {
            sum+= Math.pow(x,i);
        }
        return sum;
    }

}
