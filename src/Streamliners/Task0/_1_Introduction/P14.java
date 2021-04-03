package Streamliners.Task0._1_Introduction;

//Program to Check if a String is Empty or Null

public class P14
{
    public static void main(String[] args)
    {
        String s1 = null;
        String s2 = "";
        String s3 = "  ";

        System.out.println("s1 is " + nullOrEmpty(s1));
        System.out.println("s2 is " + nullOrEmpty(s2));
        System.out.println("s3 is " + nullOrEmpty(s3));
    }

    public static String nullOrEmpty(String str)
    {
        if (str == null)            return "NULL";
        else if (str.isEmpty())     return "EMPTY";
        else return "Neither null nor empty";
    }
}
