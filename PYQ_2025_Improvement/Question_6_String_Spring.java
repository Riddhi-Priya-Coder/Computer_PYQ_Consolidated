package PYQ_2025_Improvement;

/*

Define a class to accept a string.
Check if it is a Special String or not.
A String is Special if the number of vowels
equals to the number of consonants.

    Example: MINE
    Number of vowels = 2
    Number of Consonants = 2


 */

import java.util.Scanner;

public class Question_6_String_Spring
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a word: ");
        String w= sc.nextLine().toUpperCase();

        int cv=0; //counter of vowels
        int cc=0; // counter of consonants

        for(int i= 0; i<w.length(); i++)
        {
            char ch= w.charAt(i);

            if(ch=='A' || ch == 'E' || ch =='I' || ch =='O' || ch =='U')
                cv++;
            else
                cc++;
        }

        if(cv==cc)
            System.out.println("It is a Super String");
        else
            System.out.println("It is not a Super String");
    }
}
