// Exception Handeling
// Try / Catch

import java.lang.*;
import java.util.*;

class Exception02_14
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iAns = 0;

        System.out.println("Enter first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();

        // the statement which getnerate exception add it in try
        try
        {
            iAns = iNo1 / iNo2;     // if (iNo1 / 0) throws exception
        }

        // with try catch is catch
        // Exception class throws the object of exception which occured at try
        catch(ArithmeticException eobj)        // If we know the perticular exception
        {
            System.out.println("Exception : Arithmatic");
        }

        catch(Exception eobj)   // Generic expression / If no above execption match then only contrl go to the generic catch
        {
             System.out.println("Exception : " + eobj);
        }
        

        System.out.println("Answer : " + iAns);
    }
}