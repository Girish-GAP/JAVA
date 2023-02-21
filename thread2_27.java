// Extend threads

import java.lang.*;

class Demo extends Thread
{
    public void run()   // run method is override from Thread class // The logic should be inside run method only
    {
        System.out.println("Inside thread : " + Thread.currentThread().getName());
    }
}

class thread2_27
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

// One process can have multiple threads