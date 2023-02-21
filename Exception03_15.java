// Finally 

/*
    - It's a block which get's always executed irrespective of the exception.
    - Finally used to deallocate resources.
    - Even some exception happeens while code running and program terminate unnormally
      finally block execute.
    - Eg. at the begining we there is a logic to connect the database and the logic of diconnect to the 
      database is at end. suppose due to some error in middle program terminate at middle without reaching disconnect database logic.
      at that case we can use finally method to disconnect the database.
*/


import java.util.*;


class Exception03_15
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iAns = 0;

        System.out.println("Enter first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();

        try
        {
            iAns = iNo1 / iNo2;     
        }
        catch(Exception eobj)   
        {
             System.out.println("Exception : " + eobj);
        }


        finally
        {
          sobj.close();
        }
        

        System.out.println("Answer : " + iAns);

    }
}