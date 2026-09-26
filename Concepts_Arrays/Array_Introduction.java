package Concepts_Arrays;

public class Array_Introduction
{
    public static void main(String []args)
    {
        int a = 6; //variable

        //Array - a location which can store more than one value (of same data type)

        //Array declaration and initialization

        int digit[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        double [] value = {0.6, 0.9, 7.99};

        char []vowels = {'a', 'e', 'i', 'o', 'u'};

        String my_friends[] = {"Tom", "Peter", "Tina"};


        //Length of array - array_name.length;

        System.out.println("Length of digit array: " + digit.length);
        System.out.println("Length of value array: " + value.length);
        System.out.println("Length of vowels array: " + vowels.length);
        System.out.println("Length of my_friends array: " + my_friends.length);

        System.out.println();

        //Printing the Arrays
        System.out.println("Elements of digit array :");
        for(int i=0; i<digit.length; i++)
            System.out.println(digit[i]);

        System.out.println("Elements of value array :");
        for(int i=0; i<value.length; i++)
            System.out.println(value[i]);

        System.out.println("Elements of vowels array :");
        for(int i=0; i<vowels.length; i++)
            System.out.println(vowels[i]);

        System.out.println("Elements of my_friends array :");
        for(int i=0; i<value.length; i++)
            System.out.println(my_friends[i]);
    }
}
