package PYQ_2022;

import java.util.Scanner;

/*
    Define a class to accept two strings
    of same length and form a new word in such a way that,
    the first character of the first word
    is followed by the first character of the second word and so on.

    Example :
    Input string 1 – BALL
    Input string 2 – WORD

    OUTPUT : BWAOLRLD
*/
public class Question_7_Strings
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = sc.next();

        System.out.print("Enter String 2: ");
        String s2 = sc.next();

        if(s1.length() != s2.length())
            System.out.println("Invalid Input");
        else {
            String str = "";

            for (int i = 0; i < s1.length(); i++)
            {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);

                str = str + ch1 + ch2;
            }
            System.out.println(str);
        }
    }
}
