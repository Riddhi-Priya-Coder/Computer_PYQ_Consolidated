package PYQ_2018;

/*

Write a program in Java to accept a string in lower case
and change the first letter of every word to upper case.
Display the new string.

Sample input: we are in cyber world
Sample output: We Are In Cyber World

 */

import java.util.Scanner;

public class Question_6_Cases
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the String : ");
        String str= sc.nextLine().toLowerCase();

        String new_str="";

        for(int i =0; i< str.length(); i++)
        {
            char ch = str.charAt(i);

            if (i==0)
                new_str += Character.toUpperCase(str.charAt(i));
            else
                new_str += ch;

            if(ch==' ')
            {
                i++;
                new_str += Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println("Output : "+ new_str);
    }
}
