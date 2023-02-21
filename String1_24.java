// String in Java

// String is a non-primitive datatype in java
// without new keword string : string literal / memory allocated - string literal pool
// with new keyword : string object / memory allocated - Heap

class String1_24
{
    public static void main(String args[])
    {
        // String literals 
        String str1 = "Girish";
        String str2 = "Pawar";

        System.out.println(str1.length());

        // String object
        String str3 = new String("Girish");
        String str4 = new String("Pawar");
    }
}