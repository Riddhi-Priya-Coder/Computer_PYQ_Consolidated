package PYQ_2016;

/*

Special words are those words which start and end with the same letter.
        Example: EXISTENCE, COMIC, WINDOW

Palindrome words are those words which read the same from left to right and vice versa.
        Example: MALAYALAM, MADAM, LEVEL, ROTATOR, CIVIC

All palindromes are special words but all special words are not palindromes.

Write a program to accept a word.
Check and display whether the word is a palindrome or only a special word or none of them.

 */

import java.util.Scanner;

public class Question_6_Special_Words
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str= sc.nextLine().toUpperCase();

        int len= str.length();
        boolean t;

        if(str.charAt(0) == str.charAt(len - 1))
            t=true;




    }
}
