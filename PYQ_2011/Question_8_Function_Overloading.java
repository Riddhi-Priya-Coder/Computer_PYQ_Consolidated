package PYQ_2011;

/*

Design a class to overload a function compare( ) as follows:

void compare(int, int) — to compare two integers values and print the greater of the two integers.

void compare(char, char) — to compare the numeric value of two characters and
                           print with the higher numeric value.

void compare(String, String) — to compare the length of the two strings and print the longer of the two.

 */

import java.util.Scanner;

public class Question_8_Function_Overloading
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);

        Question_8_Function_Overloading obj = new Question_8_Function_Overloading();

        System.out.print("Enter first Integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second Integer: ");
        int n2 = sc.nextInt();
        System.out.print("The largest integer is: ");
        obj.compare(n1,n2);
        System.out.println();

        System.out.print("Enter first Character: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Enter second Character: ");
        char ch2 = sc.next().charAt(0);
        System.out.print("The largest Character is: ");
        obj.compare(ch1,ch2);
        System.out.println();
        sc.nextLine();

        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String s2 = sc.nextLine();
        System.out.print("The longest String is: ");
        obj.compare(s1,s2);
        System.out.println();
    }

    void compare(int n1, int n2)
    {
        System.out.print(Math.max(n1, n2));
    }

    void compare(char ch1, char ch2)
    {
        if(ch1>ch2)
            System.out.print(ch1);
        else
            System.out.print(ch2);
    }

    void compare(String s1, String s2)
    {
        int s1c=0, s2c=0;
        for(int i=0; i< s1.length(); i++)
            s1c++;
        for(int i=0; i< s2.length(); i++)
            s2c++;

        if(s1c>s2c)
            System.out.print(s1);
        else if(s2c>s1c)
            System.out.print(s2);
    }
}
