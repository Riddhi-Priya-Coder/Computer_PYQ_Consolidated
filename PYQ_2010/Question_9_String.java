package PYQ_2010;

/*

Write a program to input a sentence.
Count and display the frequency of each letter of the sentence in alphabetical order.
Sample Input: COMPUTER APPLICATIONS
Sample Output:

        Character	Frequency	Character	Frequency
            A	        2	        O	        2
            C	        2	        P	        3
            I	        1	        R	        1
            L	        2	        S	        1
            M	        1	        T	        2
            N	        1	        U	        1

 */

import java.util.*;
public class Question_9_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String str = sc.nextLine().toUpperCase();

        int c = 0;

        //Array of Alphabets
        int a[] = new int[26];

        //Counting the alphabets
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                a[ch - 65]++;
        }

        //Displaying the count
        System.out.println("Output : ");
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > 0)
            {
                System.out.println((char) (i + 65) + "\t" + a[i]);
            }
        }
    }
}