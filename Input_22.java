// Input using Scanner class

import java.lang.*;
import java.util.*; // import java.util.Scanner;


class Input
{
    public static void main(String args[])
    {
        // Create the object of Scanner 
        // Connect it to statndard input device(keyboard) by system.in
        Scanner sobj = new Scanner(System.in);  

        // Scanner class has multiple methods for different input
        System.out.println("Enter your name : ");
        String name = sobj.nextLine();    // String

        System.out.println("Enter your age : ");
        int age = sobj.nextInt();     // int

        System.out.println("Enter percentage : ");
        float percentage = sobj.nextFloat();       // float

        System.out.println(name + "\n" + age + "\n" + percentage);

        // If ERROR : sobj is never closed
        // sobj.close();
    }
}