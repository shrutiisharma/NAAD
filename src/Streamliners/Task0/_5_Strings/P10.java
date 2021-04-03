package Streamliners.Task0._5_Strings;

//Program to Check if a string contains a substring

public class P10
{
    public static void main(String[] args)
    {
        String str1 = "This is beautiful";
        String str2 = "beautiful";

        boolean result = str1.contains(str2);
        if(result)
            System.out.println(str2 + " is present in the string.");
        else
            System.out.println(str2 + " is not present in the string.");
    }
}
