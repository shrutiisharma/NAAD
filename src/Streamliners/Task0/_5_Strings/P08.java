package Streamliners.Task0._5_Strings;

//Program to Differentiate String == operator and equals() method

public class P08
{
    public static void main(String[] args)
    {
        String name1 = new String("hello");
        String name2 = new String("hello");

        System.out.println("Check if two strings are equal");

        // check if two strings are equal
        // using == operator
        boolean result1 = (name1 == name2);
        System.out.println("Using == operator: " + result1);

        // using equals() method
        boolean result2 = name1.equals(name2);
        System.out.println("Using equals(): " + result2);
    }
}
