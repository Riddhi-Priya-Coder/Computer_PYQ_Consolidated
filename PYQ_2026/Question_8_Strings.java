package PYQ_2026;

/*

Write a program to accept a word and print the Symbolic of the accepted word.

Symbolic word is formed by extracting the characters from the first consonant,
then add characters before the first consonant of the accepted word and end with "TR".

Example:

    1. AIRWAYS Symbolic word is RWAYSAITR
    2. BEAUTY Symbolic word is BEAUTYTR

 */
import java.util.Scanner;
public class Question_8_Strings
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word= sc.next().toUpperCase();

        int index=0;
        for(int i=0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                continue;
            else {
                index = i;
                break;
            }
        }

        String output = word.substring(index) +word.substring(0,index)+"TR";
        System.out.println("Symbolic word is "+output);


    }
}
