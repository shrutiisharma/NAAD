package Streamliners.Task0._5_Strings;

//Program to Iterate through each characters of the string.

public class P07
{
    public static void main(String[] args)
    {
        // create a string
        String name = "interesting";

        System.out.println("Characters in " + name + " are:");

        // loop through each element
        for(int i = 0; i < name.length(); i++)
        {
            // access each character
            char a = name.charAt(i);
            System.out.print(a + ", ");
        }
    }
}
