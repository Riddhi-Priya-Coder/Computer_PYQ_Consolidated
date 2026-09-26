package Concepts_Constructor;

import java.util.Scanner;

public class Prime
{
    int n;
    Prime()
    {
        n = 0;
    }
    public  static void main(String args[])
    {
        Prime obj = new Prime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int x = sc.nextInt();

        obj.input(x);
        obj.display();
    }
    void input(int x)
    {
        n=x;
    }
    void display()
    {
        int c=0;
        for(int i=1; i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");

    }
}