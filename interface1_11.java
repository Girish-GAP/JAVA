// Interface

/*
    - The concept of interface is introduced in java which is not there is in cpp.
    - Interface is consider as a blue print of a class which contans following things.
        1) Characteristics
        2) Behaviours (Abstract)
    - Characteristics of interface bydefault public static final.
    - Behaviours are by default public and abstracts
    - class can implement the interface it is a responsibility of a class to provide the definations for all abstract 
      method from interface.
    - If class is unable to provide the defination then compiler will generate error.
    - We can not define concrete methods in interface.
*/


interface Circle
{
    // Characteristics
    float Radius = 5;

    // Behaviours
    float GetArea();

    // Circle(){ Radius = 5;}  // No constructor in interface
}

class Area implements Circle
{
    public float GetArea()
    {
        return (3.14f* (Radius*Radius));
    }
}

class interface1_11
{
    public static void main(String args[])
    {
       float iRet = 0.0f;
       Area obj = new Area();
       iRet = Area.GetArea();
       System.out.println(iRet);
    }
}
