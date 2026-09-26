package PYQ_2019;

/*

Design a class to overload a function series( ) as follows:

(a) void series (int x, int n) – To display the sum of the series given below:

x1 + x2 + x3 + .......... xn terms

(b) void series (int p) – To display the following series:

0, 7, 26, 63 .......... p terms

(c) void series () – To display the sum of the series given below:

1/2 + 1/3 + 1/4 + .......... 1/10

 */

public class Question_7_Function_Overloading
{
    void series(int x, int n)
    {
        double sum=0.0;
        for(int i=1; i<=n; i++)
        {
            sum+=Math.pow(x,i);
        }
        System.out.println(sum);
    }

    void series(int p)
    {
        double sum=0.0;
        for(int i= 1; i<=p; i++)
        {
            sum=Math.pow(i,3)-1.0;
            System.out.println(sum+" ");
        }
        System.out.println(sum);
    }

    void series()
    {
        double sum=0.0;
        for(double i=2; i<=10; i++)
        {
            sum+=1.0/i;
        }
        System.out.println(sum);
    }
    public static void main(String []args)
    {
        Question_7_Function_Overloading obj = new Question_7_Function_Overloading();
        obj.series();
        obj.series(2,5);
        obj.series(6);
    }
}
