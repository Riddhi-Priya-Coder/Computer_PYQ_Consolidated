package PYQ_2022;

/*
    Define a class to accept a string,
    and print the characters with
    the uppercase and lowercase reversed,
    but all the other characters should remain the same as before.

    EXAMPLE:
    INPUT : WelCoMe_2022
    OUTPUT : wELcOmE_2022
 */


import java.util.Scanner;

public class Question_5_String_Basics
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                    rev += Character.toLowerCase(ch);
                else
                    rev += Character.toUpperCase(ch);
            }

            else
            {
                rev += ch;
            }
        }

        System.out.println(rev);
    }
}
