package PYQ_2022;

import java.util.Scanner;

/*
    Define a class to declare a character array of size ten.
    Accept the characters into the array and display the
    characters with highest and lowest ASCII
    (American Standard Code for Information Interchange) value.

    EXAMPLE :

    INPUT:
    'R', 'z', 'q', 'A', 'N', 'p', 'm', 'U', 'Q', 'F'

    OUTPUT :
    Character with the highest ASCII value = z
    Character with the lowest ASCII value = A
 */
public class Question_3_Array_maxmin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = new char[10];

        //Taking
        System.out.println("Enter 10 characters:");
        for (int i = 0; i <10; i++)
          arr[i] = sc.nextLine().charAt(0);


       char max = arr[0];
       char min = arr[0];

        for (int i = 1; i <10; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }

            if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Character with highest ASCII value: " + max);
        System.out.println("Character with lowest ASCII value: " + min);
    }
}
