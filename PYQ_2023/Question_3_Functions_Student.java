package PYQ_2023;

/*
    Design a class with the following specifications:

    Class name: Student
    Member variables:
        name        — name of student
        age         — age of student
        mks         — marks obtained
        stream      — stream allocated

        (Declare the variables using appropriate data types)

    Member methods:

        void accept() — Accept name, age and marks using methods of Scanner class.
        void allocation() — Allocate the stream as per following criteria:

         mks	                   stream
    >= 300	                Science and Computer
    >= 200 and < 300	    Commerce and Computer
    >= 75 and < 200	        Arts and Animation
    < 75	                Try Again

    void print() – Display student name, age, mks and stream allocated.

    Call all the above methods in main method using an object.

 */

import java.util.Scanner;

public class Question_3_Functions_Student
{
    //Declaration
    String name;
    int age;
    double mks;
    String stream;

    Question_3_Functions_Student()
    {
        //Initialization
        name = "";
        age = 0;
        mks = 0.0;
        stream = "";
    }

    public static void main(String[] args)
    {
        Question_3_Functions_Student obj = new Question_3_Functions_Student();

        obj.accept();
        obj.allocation();
        obj.print();
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name");
        name = sc.nextLine();

        System.out.println("Enter your age");
        age = sc.nextInt();

        System.out.println("Enter your marks");
        mks = sc.nextDouble();
    }

    void allocation()
    {
        if (mks >= 300)
            stream = "Science and Computer";
        else if (mks >= 200)
            stream = "Commerce and Computer";
        else if (mks >= 75)
            stream = "Arts and Animation";
        else
            stream = "Try Again";
    }

    void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks Obtained: " + mks);
        System.out.println("Stream allocated: " + stream);
    }
}