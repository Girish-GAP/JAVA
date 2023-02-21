// Final

/*
    - The concept of final in java indicates non-modifiable entity.
    1) Final characteristics of a class
    2) Final method of a class
    3) Final class
*/

// Final characterisitcs of a class

class Demo
{
    public int i;
    public final int j = 20;    // we can directly intilize here
    public final int k;     

    public Demo() : 
    {
        this.i = 5;
        this.k = 10;        // we can initlize constant characterstics in constructor also
    }

    public Demo(int i, int j)
    {
        this.i = i;
        this.k = j;
    }

    public void fun()
    {
        i++;    // A
        // j++;    // NA
        // k++;     // NA
    }

}


class Final1_7
{
    public static void main(String args[])
    {
        Demo obj = new Demo();

        obj.fun();
        System.out.println(obj.i);
        System.out.println(obj.k);
        System.out.println(obj.j);
    }
}