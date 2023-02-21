// Exception Handling
// By using exception handeling we can avoid the abnormal termination of program.

import java.lang.*;
import java.util.*;

class Exception01_13
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();

        int iAns = iNo1 / iNo2;     // if (iNo1 / 0) throws exception

        System.out.println(iAns);
        
    }
}