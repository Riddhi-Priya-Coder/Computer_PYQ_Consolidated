package PYQ_2017;

/*

Design a class to overload a function check( ) as follows:

void check (String str , char ch ) — to find and print the frequency of a character in a string.
Example:
            Input:  str = "success"
                    ch = 's'

            Output: number of s present is = 3

void check(String s1) — to display only vowels from string s1, after converting it to lower case.
Example:
            Input:  s1 = "computer"

            Output: o u e


 */

import java.util.Scanner;

public class Question_8_Function_Overload
{
    Scanner sc = new Scanner(System.in);

    void check(String str, char ch)
    {
        System.out.print("Enter the Word: ");
        str = sc.nextLine();

        System.out.print("Enter the letter whose frequency is to be searched: ");
        ch = sc.next().charAt(0);
        sc.nextLine();

        int a=0;

        for(int i= 0; i<str.length(); i++)
        {
            char c= str.charAt(i);
            if(ch==c)
                a++;
        }
        System.out.println("Number of "+ch+" present is "+a);
    }

    void check(String s1)
    {
        System.out.print("Enter a word: ");
        s1= sc.nextLine().toLowerCase();

        for(int i=0; i<s1.length(); i++)
        {
            char v = s1.charAt(i);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
                System.out.print(v + " ");
        }
    }

    public static void main(String[]args)
    {
        Question_8_Function_Overload obj = new Question_8_Function_Overload();
        obj.check("",' ');
        obj.check("");
    }
}

