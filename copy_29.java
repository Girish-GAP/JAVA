// Object Cloning

import java.lang.*;

class Demo implements Cloneable
{
    public int a;
    public String name;

    public Demo(int a, String name)
    {
        this.a = a;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
7
class copy
{
    public static void main(String args[])  throws CloneNotSupportedException
    {
        Demo obj = new Demo(10, "Girish");

        Demo obj2X = (Demo)obj.clone();
        System.out.println(obj2X.a + " " +obj2X.name);
    }
}