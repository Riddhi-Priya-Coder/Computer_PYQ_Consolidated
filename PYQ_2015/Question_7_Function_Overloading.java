package PYQ_2015;

/*

Design a class to overload a function Joystring( ) as follows:

void Joystring(String s, char ch1, char ch2) with one string argument
and two character arguments that replaces the character argument ch1
with the character argument ch2 in the given String s and prints the new string.

Example:
Input value of s = "TECHNALAGY"
ch1 = 'A'
ch2 = 'O'
Output: "TECHNOLOGY"

void Joystring(String s) with one string argument that prints the position
of the first space and the last space of the given String s.

Example:
Input value of s = "Cloud computing means Internet based computing"
Output:
First index: 5
Last Index: 36

void Joystring(String s1, String s2) with two string arguments
that combines the two strings with a space between them and prints the resultant string.

Example:
Input value of s1 = "COMMON WEALTH"
Input value of s2 = "GAMES"
Output: COMMON WEALTH GAMES

(Use library functions)

 */

import java.util.Scanner;

public class Question_7_Function_Overloading
{

    void Joystring(String s, char ch1, char ch2)
    {
        String str="";
        for(int i=0;i<s.length()-1; i++)
        {
            if(s.charAt(i)==ch1)
                str += ch2;
            else
                str += s.charAt(i);
        }

        System.out.println("Output : "+str);
    }

    void Joystring(String s)
    {


    }
    public static void main(String args[])
    {
        Question_7_Function_Overloading obj = new Question_7_Function_Overloading();
        Scanner sc = new Scanner(System.in);

        //first method
        System.out.print("Enter a word: ");
        String s= sc.nextLine();

        System.out.print("Enter the character to be replaced: ");
        char ch1= sc.next().charAt(0);

        System.out.print("Enter the character to be replaced with: ");
        char ch2= sc.next().charAt(0);

        obj.Joystring(s,ch1,ch2);


    }
}