package PYQ_2024;

/*
Define a class to accept the gmail id and check for its validity.

A gmail id is valid only if it has:

→ @
→ .(dot)
→ gmail
→ com

Example: icse2024@gmail.com is a valid gmail id

 */

import java.util.Scanner;

public class Question_8_Gmail
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Gmail ID");
        String id= sc.nextLine();

        if (id.endsWith("@gmail.com")
                && id.indexOf('@') == id.length() - 10)
            System.out.println(id+ " is a valid Gmail ID");
        else
            System.out.println(id+ " is not a valid Gmail ID");
    }
}
