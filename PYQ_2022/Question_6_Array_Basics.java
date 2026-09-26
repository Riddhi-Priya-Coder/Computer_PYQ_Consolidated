package PYQ_2022;

import java.util.Scanner;

/*
    Define a class to declare an array to accept
    and store ten words. Display only those words
    which begin with the letter 'A' or 'a'
    and also end with the letter 'A' or 'a'.

    EXAMPLE :
    Input : Hari, Anita, Akash, Amrita, Alina, Devi Rishab, John, Farha, AMITHA

    Output:
    Anita
    Amrita
    Alina
    AMITHA
*/
public class Question_6_Array_Basics
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        //Hard-coded - not to use in Exam - Using here to simplify
        String names[] = {"Hari", "Anita", "Akash", "Amrita", "Alina",
                "Devi Rishab", "John", "Farha", "AMITHA"};

//        String names[] = new String[10];
//
//        System.out.println("Enter 10 names : ");
//        for (int i=0; i < 10; i++)
//        {
//            names[i] = sc.nextLine();
//        }

        System.out.println("Names that begin and end with letter A or a are:");

        for(int i=0; i<names.length; i++)
        {
            String name = names[i].toLowerCase();

            if (name.startsWith("a") && name.endsWith("a"))
                System.out.println(name);
        }

//        for(int i = 0; i < names.length; i++)
//        {
//            String str = names[i];
//            int len = str.length();
//
//
//            char start  = Character.toUpperCase(str.charAt(0));
//            char end = Character.toUpperCase(str.charAt(len - 1));
//
//            if (start == 'A' && end == 'A')
//            {
//                System.out.println(str);
//            }
//        }
    }
}
