// Jagged Array
// It is a type of array in java which contains fix. No. of rows but variable 
// no. of columns in each row

import java.lang.*;

class JaggedArray01_18
{
    public static void main(String args[])
    {
        int arr[][] = new int[3][];

        arr[0] = new int[3];    // At row 0 add 3 columns
        arr[1] = new int[5];    // At row 1 add 5 columns
        arr[2] = new int[2];    // At row 2 add 2 columns
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}