// implements Runnable

import java.lang.*;

class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Inside thread : " + Thread.currentThread().getName());
    }
}

class Thread3_28
{
    public static void main(String a[]) throws Exception
    {
        Demo obj1 = new Demo();
        Thread t1 = new Thread(obj1, "First");

        Demo obj2 = new Demo();
        Thread t2 = new Thread(obj2, "Second");

        t1.start();
        t2.start();

    }
}