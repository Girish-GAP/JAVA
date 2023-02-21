// Wrapper Classes 
// For every datatype superset class is is created which is called as wrapper class.
// Boxing : convert primitive datatype to it's corrosponding wrapper class.
// Unboxing : convert wrapper class into primitive datatype

import java.lang.*;
import java.util.*;


class wrapper1_22
{
    public static void main(String args[])
    {
        int iNo = 11;
        // Integer iobj = new Integer(11);      // Depreciated
        Integer iobj = 11;

        int i = iobj;   // Unboxing
        Integer iobj2 = iNo;    // Boxing

        System.out.println(iobj);
        System.out.println(iNo);
        System.out.println(i);
        System.out.println(iobj2);

    }
}