// Array in java


import java.lang.*;
import java.util.*;


class Array2_17
{
    public static void main(String args[])
    {
        // arr is a 2D array which contains 2 one dimensional array
        // each 1D array contains 3 elements 
        // each element is of type intiger
        int arr[][] = new int[2][3];

        arr[0][0] = 11;
        arr[0][1] = 21;
        arr[0][2] = 51;
        arr[1][0] = 101;
        arr[1][1] = 111;
        arr[1][2] = 121;
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)  // arr[i].length is to get size of one D array
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}