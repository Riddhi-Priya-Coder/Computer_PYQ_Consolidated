package PYQ_2022;
/*
    Define a class to declare an array of size twenty of double datatype,
    accept the elements into the array and perform the following :

    Calculate and print the product of all the elements.
    Print the square of each element of the array.
*/

import java.util.Scanner;

public class Question_4_Array_Numbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n=5; //optional
        double  arr[] = new double[n];


        //Taking Inputs
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextDouble();
        }

        //Calculation - Finding products
        double p = 1.0;
        for (int i = 0; i < arr.length; i++)
        {
            p *= arr[i];
        }
        System.out.println("Product = " + p);

        //Calculation - Finding square root
        System.out.println("Square of array elements :");
        for (int i = 0; i < arr.length; i++)
        {
            double sq = Math.pow(arr[i], 2);
            System.out.println(sq);
        }
    }
}
