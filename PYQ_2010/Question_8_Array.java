package PYQ_2010;

/*

Write a program to store 6 elements in an array P and 4 elements in an array Q.
Now, produce a third array R, containing all the elements of array P and Q.
Display the resultant array.

            Input	Input	Output
            P[ ]	Q[ ]	 R[ ]
              4	     19	      4
              6	     23	      6
              1	     7	      1
              2	     8	      2
              3	 	          3
              10	 	      10
                              19
                              23
                              7
                              8

 */

import java.util.Scanner;

public class Question_8_Array
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);

        //Taking input for P[]
        int P[] = new int[6];
        System.out.println("Enter the 6 elements for array P[] : ");
        for(int i=0; i<P.length; i++)
        {
            P[i]=sc.nextInt();
        }

        //Taking input for Q[]
        int Q[] = new int[4];
        System.out.println("Enter the 4 elements for array Q[]");
        for(int i=0; i<Q.length; i++)
        {
            Q[i]=sc.nextInt();
        }

        //Creating Array R[]
        int R[] = new int[P.length + Q.length];

        //Taking the values
        int c=0;
        for(int j=0; j<P.length; j++)
            R[c++] = P[j];

        for(int j=0; j<Q.length; j++)
            R[c++]= Q[j];

        //Displaying the Merged Array
        System.out.println("Merged Array : ");
        for(int i=0; i<R.length; i++)
            System.out.println(R[i]);
    }
}