package PYQ_2014;

/*

Define a class named movieMagic with the following description:

    Data Members	    Purpose
    int year	        To store the year of release of a movie
    String title	    To store the title of the movie
    float rating	    To store the popularity rating of the movie

(minimum rating=0.0 and maximum rating=5.0)

    Member Methods	    Purpose
    movieMagic()	    Default constructor to initialize numeric data members to 0
                        and String data member to "".
    void accept()	    To input and store year, title and rating
    void display()	    To display the title of the movie and a message based on the
                        rating as per the table given below

    Ratings Table

    Rating	            Message to be displayed
    0.0 to 2.0	        Flop
    2.1 to 3.4	        Semi-Hit
    3.5 to 4.4	        Hit
    4.5 to 5.0	        Super-Hit

Write a main method to create an object of the class and call the above member methods.

 */

import java.util.Scanner;

public class Question_4_Function_Overloading
{
    int year;
    String title;
    float rating;

    void movieMagic()
    {
        year=0;
        title="";
        rating=0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Title of the Movie: ");
        title=sc.nextLine();

        System.out.print("Enter Year of the Movie: ");
        year = sc.nextInt();

        System.out.print("Enter Rating of the Movie: ");
        rating = sc.nextFloat();

    }

    void display()
    {
        System.out.println("The Title of the Movie: "+title);

        if(rating<=2.0f)
            System.out.println("Flop");
        else if(rating<=3.4f)
            System.out.println("Semi-Hit");
        else if(rating<=4.4)
            System.out.println("Hit");
        else
            System.out.println("Super-Hit");

    }

    public static void main(String[]args)
    {
        Question_4_Function_Overloading obj = new Question_4_Function_Overloading();
        obj.movieMagic();
        obj.accept();
        obj.display();
    }
}
