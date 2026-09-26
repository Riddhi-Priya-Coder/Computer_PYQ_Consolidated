package PYQ_2023;

import java.util.Scanner;

/*
    Define a class to accept a String and print
    the number of digits, alphabets and special characters in the string.

    Example:
    S = "KAPILDEV@83"

    Output:
    Number of digits – 2
    Number of Alphabets – 8
    Number of Special characters – 1

 */
public class Question_6_Strings
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);

        //Input
        System.out.println("Enter the string");
        String str = sc.nextLine();

        //Calculation / Counting
        int count_d = 0, count_a = 0, count_sc = 0;
        //int count_w = 0;

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(Character.isDigit(ch))
                count_d++;
            else if(Character.isLetter(ch))
                count_a++;
//            else if(Character.isWhitespace(ch))
//                count_w++;
            else
                count_sc++;
        }

        //Result display
        System.out.println("Number of digits - "+count_d);
        System.out.println("Number of alphabets - "+count_a);
        System.out.println("Number of special characters - "+count_sc);
        //System.out.println("Number of white spaces = "+count_w);
    }

}
