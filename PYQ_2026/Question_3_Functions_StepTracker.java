package PYQ_2026;


/*
Define a class named StepTracker with the following specifications:

Member Variables:

String name – stores the user's name
int sw – stores the total number of steps walked by the user.
double cb – stores the estimated calories burned by the user.
double km – stores the estimated distance walked in kilometers.

Member Methods:

void accept()       – to input the name and the steps walked using Scanner class methods only.
void calculate()    – calculates calories burned and distance in km based on steps walked

Use the following estimation table:
    Metric	                      Calculation Formula
Calories Burned     -	steps walked x 0.04 (e.g., 1-step burns 0.04 calories)
Distance (Km)       -	steps walked / 1300 (e.g., 1300 steps is approx. 1 km)

void display() – Display the calories burned, distance in km and the user's name.
*/


import java.util.Scanner;

public class Question_3_Functions_StepTracker
{
    String name;
    int sw;
    double cb;
    double km;

    Question_3_Functions_StepTracker() //Constructor
    {
        name ="";
        sw = 0;
        cb = 0.0;
        km = 0.0;
    }

    public static void main (String[]args)
    {
        Question_3_Functions_StepTracker obj = new Question_3_Functions_StepTracker();

        obj.accept();
        obj.calculate();
        obj.display();
    }


    void accept()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the name of the user");
        name= sc.nextLine();

        System.out.println("Enter the number of steps walked");
        sw= sc.nextInt();
    }

    void calculate()
    {
        cb= sw*0.04;
        km= sw/1300.0;
    }

    void display()
    {
        System.out.println("User name : "+name);
        System.out.println("Calories burnt = "+cb);
        System.out.println("Distance walked = "+km +" km");
    }
}
