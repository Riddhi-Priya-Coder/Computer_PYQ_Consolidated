package PYQ_2024;

/*
Define a class to overload the method perform as follows:

double perform (double r, double h) — to calculate and
return the value of curved surface area of cone

CSA = pi*r*l
l= sq.root(r^2+h^2)

void perform (int r, int c) — Use NESTED FOR LOOP to generate the following format

        r = 4, c = 5

        output
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5

void perform (int m, int n, char ch) — to print
the quotient of the division of m and n
if ch is Q else print the remainder of the division of m and n if ch is R

*/

import java.util.Scanner;

class Question_4_Functions_Overloading
{
    //Declaration
    String name;
    int age;
    double mks;
    String stream;

    Question_4_Functions_Overloading()
    {
        //Initialization
        name = "";
        age = 0;
        mks = 0.0;
        stream = "";
    }

    public static void main(String[] args)
    {
        Question_4_Functions_Overloading obj = new Question_4_Functions_Overloading();

        obj.accept();
        obj.allocation();
        obj.print();
    }

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name");
        name = sc.nextLine();

        System.out.println("Enter your age");
        age = sc.nextInt();

        System.out.println("Enter your marks");
        mks = sc.nextDouble();
    }

    void allocation() {
        if (mks >= 300)
            stream = "Science and Computer";
        else if (mks >= 200)
            stream = "Commerce and Computer";
        else if (mks >= 75)
            stream = "Arts and Animation";
        else
            stream = "Try Again";
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks Obtained: " + mks);
        System.out.println("Stream allocated: " + stream);
    }
}

