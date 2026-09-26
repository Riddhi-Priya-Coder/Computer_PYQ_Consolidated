package PYQ_2024_Specimen;

/*

Define a class to accept a string and convert it into uppercase.
Count and display the number of vowels in it.

    Input: robotics
    Output: ROBOTICS
    Number of vowels: 3
 */

import java.util.Scanner;

public class Question_5_Count_Vowels
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String word = sc.nextLine().toUpperCase();

        int count=0;
        for(int i=0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            if((ch == 'A') || (ch == 'E')|| (ch == 'I') || (ch == 'O') || (ch == 'U'))
                count++;
        }

        System.out.println("Output : "+word);
        System.out.println("Number of vowels : "+count);



    }
}
