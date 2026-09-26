package PYQ_2019;

/*

Write a program to input a sentence and convert it into
uppercase and count and display the total number of words
starting with a letter 'A'.

Example:

Sample Input: ADVANCEMENT AND APPLICATION OF
              INFORMATION TECHNOLOGY ARE EVER CHANGING.

Sample Output: Total number of words
               starting with letter 'A' = 4

 */

import java.util.Scanner;

public class Question_8_Upper_Case
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a sentence");
        String sen = sc.nextLine().toUpperCase();
        int c=0;

        for (int i = 0; i < sen.length(); i++)
        {
            if (sen.charAt(i) == ' ' && sen.charAt(i + 1) == 'A')
                c++;
        }
        System.out.println("Total number of words starting with letter 'A' = " + c);
    }
}
