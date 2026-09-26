package PYQ_2011;

/*

Write a program to accept a word and convert it into lower case, if it is in upper case.
Display the new word by replacing only the vowels with the letter following it.
Sample Input: computer
Sample Output: cpmpvtfr

 */

import java.util.Scanner;

public class Question_7_String
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String");
        String str= sc.nextLine().toLowerCase();

        String newStr="";
        char nextChar;

        for(int i=0; i< str.length(); i++)
        {
            char ch =  str.charAt(i);

            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                nextChar = (char)(ch + 1);
                newStr +=  nextChar;

            }

            else
                newStr = newStr + ch;


            System.out.println(newStr);
        }
    }
}
