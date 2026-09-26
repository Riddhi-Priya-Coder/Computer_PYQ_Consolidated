package PYQ_2012;

/*

Write a program to accept a string. Convert the string into upper case letters.
Count and output the number of double letter sequences that exist in the string.

Sample Input: "SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE"
Sample Output: 4

 */

import java.util.Scanner;

public class Question_6_String
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String str=sc.nextLine().toUpperCase();

        int c=0;

        for(int i=0; i<str.length() - 1; i++)
        {
            char ch= str.charAt(i);
            if( ch == str.charAt(i+1) )
                c++;
        }

        System.out.print(c);
    }
}
