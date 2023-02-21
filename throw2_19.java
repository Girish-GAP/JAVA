// Thorws keyword in java
// If the function creator is not going to handel the excpetion then at the end of prototype
// of that function we use throws keyword.


import java.lang.*;
import java.util.*;


class Demo
{
    public int Division(int no1, int no2)   throws Exception
    {
        return no1/no2;
    }
}


class throw2_19
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        Demo obj = new Demo();
        int iAns = 0;

        System.out.println("Enter first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();

        // try
        // {
            iAns = obj.Division(iNo1, iNo2);
        // }
        // catch(Exception eobj)
        // {
        //     System.out.println("Exception : " + eobj);
        // }

        System.out.println("End");

    }
}
