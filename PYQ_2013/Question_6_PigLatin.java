package PYQ_2013;

/*

Write a program that encodes a word into Piglatin.
To translate word into Piglatin word, convert the word into uppercase
and then place the first vowel of the original word as
the start of the new word along with the remaining alphabets.
The alphabets present before the vowel being shifted towards the end followed by "AY".

Sample Input 1: London
Output:         ONDONLAY

Sample Input 2: Olympics
Output:         OLYMPICSAY

Sample Input 3 : Shreyas
Output:          EYASSHRAY

 */

import java.util.Scanner;

public class Question_6_PigLatin
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Word: ");
        String w= sc.nextLine().toUpperCase();

        int index=0;
        for (int i= 0; i<w.length(); i++)
        {
            char ch = w.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                index=i;
                break;
            }
        }

        String piglatin = w.substring(index) + w.substring(0,index) +"AY";
        System.out.println("Output : "+piglatin);

    }
}
