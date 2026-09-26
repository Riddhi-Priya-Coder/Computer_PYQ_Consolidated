package PYQ_2025;

/*

Define a class to accept a String and print if it is a Super String or not.
A String is Super if the number of uppercase letters are equal
to the number of lowercase letters. [Use Character and String methods only]

Example: “COmmITmeNt”
Number of uppercase letters = 5
Number of lowercase letters = 5
String is a Super String

 */

import java.util.Scanner;

public class Question_5_Super_String
{
    public static void main (String []args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a Word : ");
        String word= sc.nextLine();

        int c_upper=0;
        int c_lower=0;

        for( int i= 0; i< word.length(); i++)
        {
            char ch = word.charAt(i);

            if(Character.isUpperCase(ch))
                c_upper++;
            else
                c_lower++;

        }
        System.out.println("Number of uppercase letters = " + c_upper);
        System.out.println("Number of lowercase letters = " + c_lower);
        if (c_lower == c_upper)
            System.out.println("It is a Super String");
        else
            System.out.println("Invalid Input");
    }
}
