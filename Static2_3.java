// Staitc Behaviours

// Same like cpp : We can only access static members inside static method

import java.lang.*;


class Demo
{
    // Non-Static
    public int a;
    public int b;

    // Static
    public static int k = 5;

    // Static method
    public static void fun()
    {
        k = 10;     // Only can access static members
        // a = 5;   // Can not access non-static members
    }

    // Non static method
    public void gun()
    {
        k = 15;         // non-static method can access static as well as non-staic method.
        a = 20; 
        b = 30;
    }

}


class Static2_3
{
    public static void main(String args[])
    {
        Demo obj1 = new Demo();
    }
}