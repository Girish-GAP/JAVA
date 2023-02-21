import java.lang.*;


class Demo
{
    static int a = 5;   // static 
    int b = 10;         // not-static


    // static funciton
    static void Stat()
    {
        System.out.println("static function");
        // System.out.println(b);          // NA - Non Applicable
    }

    // non-static function
    void Normal()
    {
        System.out.println("Normal function");
        // System.out.println(a);       // A- Applicable
    }

}


class Static
{
    public static void main(String args[])
    {
        Demo obj = new Demo();

        System.out.println(args[0]);
        System.out.println(args[1]);

        // System.out.println(obj.a);
        
        // // Demo.Normal();

        // System.out.println(Demo.a);
        
        // Demo.Stat();  // without object creation
        // obj.Stat();   // with object    


        // System.out.println(Demo.b);
        // Demo.Normal();


        // System.out.println();

    }
}