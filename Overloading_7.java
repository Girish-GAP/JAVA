// Method Overloading

/*
    - In case of mehtod overloading we have to define multiple method with same name 
      and with the different prototype.
    - All this mehtos should be inside same class.
    - We can achive method overloading by (name mangling)
        - change in datatypes
        - change in sequence of datatypes
        - change in no.of parameters
*/

import java.lang.*;


class Demo
{
    // Add@2i
    public int Add(int a, int b)
    {
        return a+b;
    }

    // Add@3i
    public int Add(int a, int b, int c)
    {
        return a+b+c;
    }

    // Add@4i
    public int Add(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }
}


class overloading_7
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        int iRet = 0;

        iRet = obj.Add(1,2);         // obj.Add@2i(1,2)
        System.out.println(iRet);
        
        iRet = obj.Add(1,2,3);       // obj.Add@3i(1,2,3)
        System.out.println(iRet);

        iRet = obj.Add(1,2,3,4);     // obj.Add@4i(1,2,3,4)
        System.out.println(iRet);
    }
}