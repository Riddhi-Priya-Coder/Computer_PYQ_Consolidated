package PYQ_2012;

/*

Write a program to accept the names of 10 cities in a single dimensional string array
and their STD (Subscribers Trunk Dialing) codes in another single dimension integer array.
Search for the name of a city input by the user in the list.
If found, display "Search Successful" and print the name of the city
along with its STD code, or else display the
message "Search unsuccessful, no such city in the list".

 */

import java.util.Scanner;

public class Question_9_Single_Dimensional_Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=5;

        String city[] = new String [n];
        String std[] = new String [n];

        //Input
        System.out.print("Enter the names of 10 cities and their std code : ");
        for(int i=0; i<n;i++) {
            city[i] = sc.nextLine();
            std[i] = sc.nextLine();
        }

        System.out.print("Enter the name of the city to be searched : ");
        String name =sc.nextLine();

        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(city[i].equals(name))
            {
                flag=true;
                System.out.println("Search Successful");
                System.out.println("City name : "+name+ " std code : "+std[i]);
                break;
            }
        }

        if(flag==false)
            System.out.println("Search unsuccessful");
    }
}
