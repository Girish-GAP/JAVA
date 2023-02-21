// Final class

/*
    - Final class is such a class which can-not be inhereted.
    - We can't reuse that class but still we can create object of that class.
*/

import java.lang.*;

final class Base
{
    public int a;
}

// class Derived extends Base       // Not allowed
// {

// }


class Final3_8
{
    public static void main(String args[])
    {   
        Base obj = new Base();
        obj.a = 5;
        System.out.println(obj.a);
    }
}

