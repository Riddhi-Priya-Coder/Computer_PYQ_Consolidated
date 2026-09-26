package Rev;

/*

Write a program to input a number and check whether the number is an Adam number or not.
A number is called an Adam number, if the reverse of the square of the number
is equal to the square of the reverse of the number.

Example :   Input : 12
            Square of 12 = 144 and its reverse is 441
            Reverse of 12 = 21
            Square of 21 = 441.

Since the reverse of the square of 12 is equal to the square of the reverse number, 12 is
an Adam number.

 */

import java.util.Scanner;

public class PRV5
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int original_num = sc.nextInt();
        int copy_onum = original_num;

        int sq_original_num = original_num * original_num;


        //Finding rev of sq. of original number
        int rev_of_sq_of_original_num = 0;
        while(sq_original_num >0)
        {
            int d1= sq_original_num %10;
            rev_of_sq_of_original_num = (rev_of_sq_of_original_num *10)+d1;

            sq_original_num/=10;
        }

        //Finding the reverse of original number
        int rev_original_num=0;

        while(original_num>0)
        {
            int d= original_num%10;
            rev_original_num= (rev_original_num*10) + d;

            original_num/=10;
        }

        int sq_of_rev_of_original_num = rev_original_num*rev_original_num;

        if(sq_of_rev_of_original_num == rev_of_sq_of_original_num)
            System.out.println("It's an Adam number");
        else
            System.out.println("It's not an Adam number");
    }
}