package PYQ_2025_Specimen;

/*

    Define a class to accept a string and
    convert the same to uppercase, create and
    display the new string by replacing each vowel
    by immediate next character and
    every consonant by the previous character.
    The other characters remain the same.

        Example:
        Input : #IMAGINATION@2024
        Output : #JLBFJMBSJPM@2024
 */

import java.util.Scanner;

public class Question_5_String
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a string: ");
        String word = sc.nextLine().toUpperCase();

        String str ="";

        for(int i= 0; i<word.length(); i++)
        {
            char ch = word.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    str = str + (char) (ch + 1);
                else
                    str = str + (char) (ch - 1);
            } else
                str += ch;
        }

        System.out.println("Output : "+str);

    }
}
