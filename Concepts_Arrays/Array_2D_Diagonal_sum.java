package Concepts_Arrays;

public class Array_2D_Diagonal_sum
{
    public static void main(String []args)
    {
        /*
           To finding the diagonals the array must be a square array
           For n x n array ->
            For the left diagonal   -> sum of indexes = n-1
            For the right diagonal  -> both are indexed are same
         */

        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {1,3,5,7},
                {2,5,3,1}
        };

        int rd=0, ld=0;

        //Finding the diagonals
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if (i==j)
                    rd += arr[i][j];        //right diagonal

                if(i+j == 3)
                    ld += arr[i][j];
            }
        }

        System.out.println("Sum of right diagonal elements : "+rd);
        System.out.println("Sum of ld diagonal elements : "+ld);

    }
}
