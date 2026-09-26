package PYQ_2014;

/*

Write a program to assign a full path and file name as given below.
Using library functions, extract and output the file path, file name
and file extension separately as shown.

Input
        C:\Users\admin\Pictures\flower.jpg

Output
        Path: C:\Users\admin\Pictures\
        File name: flower
        Extension: jpg

 */

import java.util.Scanner;

public class Question_6_SubString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the full path: ");
        String filepath= sc.nextLine();

        int indx_slash = filepath.lastIndexOf("\\");
        int indx_dot = filepath.lastIndexOf(".");

        System.out.println("Path : "+filepath.substring(0,indx_slash+1));
        System.out.println("File name : "+filepath.substring(indx_slash+1,indx_dot));
        System.out.println("Extension : "+filepath.substring(indx_dot+1));
    }
}
