package Rev;

/*

Define a class to declare a character array of size ten,
accept the character into the array and perform the following:

        . Count the number of uppercase letters in the array and print.
        . Count the number of vowels in the array and print.

 */

import java.util.Scanner;

public class PRV4
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        char []arr = new char[10];
        System.out.println("Enter a character array of size ten");

        for (int i = 0; i < 10; i++)
        {
            arr[i] = sc.next().charAt(0);
        }

        int upper = 0;
        int vowel = 0;

        for (int i = 0; i < 10; i++)
        {
            if (arr[i] >= 'A' && arr[i] <= 'Z')
                upper++;

            if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                vowel++;
        }

        System.out.println("The number of uppercase letters in the array are: "+upper);
        System.out.println("The number of vowels in the array are: "+vowel);
    }
}