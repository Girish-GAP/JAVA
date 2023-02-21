import java.lang.*;



class thread1_26
{
    public static void main(String args[])
    {
        System.out.println("Inside main");

        Thread tobj = Thread.currentThread();       // staic class.method
   
        System.out.println("Name of current thread : " + tobj.getName());   // non-static  object.method
    }
}