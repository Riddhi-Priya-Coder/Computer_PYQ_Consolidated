package PYQ_2026;

import java.util.Scanner;

/*
Define a class to overload the method format as follows:

1. void format(): To print the following pattern using Nested for loops only.

        1 2 3 4 5
        2 3 4 5
        3 4 5
        4 5
        5

2. int format(String s): To calculate and return the sum of ASCII codes of each character of the String.

        Example: CAB
        Output: 67 + 65 + 66
        198

3. void format(int n): To calculate and display the sum of natural numbers up to n given by the formula.

        n(n+1)/2
 */
public class Question_7_Function_Overloading {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Question_7_Function_Overloading obj = new Question_7_Function_Overloading();

        //First task
        System.out.println("Printing the pattern : ");
        obj.format();


        //Second Task
        System.out.println("Enter the word : ");
        String word = sc.next();

        int sum = obj.format(word);
        System.out.println("sum of ASCII codes of each character : "+sum);


        //Third Task
        System.out.print("Enter the natural number : ");
        int n = sc.nextInt();
        obj.format(n);

    }

    void format()   //no parameter
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j <=5; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    int format(String S)   //one String parameter with int return type
    {
        int sum=0;
        for(int i=0; i<S.length(); i++)
        {
            int ch = S.charAt(i);
            sum += ch;
        }

        return sum;
    }

    void format(int n)      //one int parameter with no return type
    {
        double sum = (n*(n+1))/2.0;
        System.out.println("Sum of n natural numbers = "+sum);

    }

}

