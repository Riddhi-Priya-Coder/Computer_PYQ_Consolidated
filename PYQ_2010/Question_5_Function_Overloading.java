package PYQ_2010;

/*

Define a class Student as given below:

Data members/instance variables:
name, age, m1, m2, m3 (marks in 3 subjects), maximum, average

Member methods:

A parameterized constructor to initialize the data members.
1. To accept the details of a student.
2. To compute the average and the maximum out of three marks.
3. To display the name, age, marks in three subjects, maximum and average.

Write a main method to create an object of a class and call the above member methods.

 */

import java.util.Scanner;

public class Question_5_Function_Overloading
{
    Scanner sc = new Scanner(System.in);

    String name;
    int age;
    double m1;
    double m2;
    double m3;
    double maximum;
    double average;

    Question_5_Function_Overloading()
    {
        name = "";
        age = 0;
        m1 = 0.0;
        m2 = 0.0;
        m3 = 0.0;
        maximum = 0.0;
        average = 0.0;
    }

    void accept()
    {
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your marks for subject 1: ");
        m1 = sc.nextDouble();
        System.out.print("Enter your marks for subject 2: ");
        m2 = sc.nextDouble();
        System.out.print("Enter your marks for subject 3: ");
        m3 = sc.nextDouble();
    }

    void compute()
    {
        average = (m1 + m2 + m3) / 3;
        maximum = Math.max(m1, m2);
        if(m1>m2)
            maximum = Math.max(m1,m3);
        else
            maximum = Math.max(m2,m3);
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks for subject 1: " + m1);
        System.out.println("Marks for subject 2: " + m2);
        System.out.println("Marks for subject 3: " + m3);
        System.out.println("Maximum: " + maximum);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args)
    {
        Question_5_Function_Overloading obj = new Question_5_Function_Overloading();

        obj.accept();
        obj.compute();
        obj.display();
    }
}
