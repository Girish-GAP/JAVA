// Bufferreader

// 1) InputStreamReader Object which connect to keyboard(System.in)
// 2) BufferReader Object which connect to the object of InputStreamReader
// 3) Use readLine() method of buffereReader class to read data in string
// 4) If you want Convert that data into another datatype by parsing


import java.lang.*;
import java.io.*;


class inputBuffer3_20
{
    public static void main(String args[])  throws Exception
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter your name : ");
        String name = bobj.readLine();

        System.out.println("Enter your age : ");
        int age = Integer.parseInt(bobj.readLine());

        System.out.println("Enter float number : ");
        float fnum = Float.parseFloat(bobj.readLine());

        System.out.println("Enter Double : ");
        double dnum = Double.parseDouble(bobj.readLine());

        System.out.println(name);
        System.out.println(age);
        System.out.println(fnum);
        System.out.println(dnum);

    }
}