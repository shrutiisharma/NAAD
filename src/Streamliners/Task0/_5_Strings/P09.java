package Streamliners.Task0._5_Strings;

// Program to Implement switch statement on strings

public class P09
{
    public static void main(String[] args)
    {
        String str = "two";
        switch (str)
        {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }
    }
}
