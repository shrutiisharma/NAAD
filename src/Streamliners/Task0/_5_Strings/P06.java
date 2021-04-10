package Streamliners.Task0._5_Strings;

//Program to Capitalize the first character of each word in a String

public class P06
{
    public static void main(String[] args)
    {
        String s = "hello";

        String firstLetter = s.substring(0, 1);
        String remainingLetters = s.substring(1);

        firstLetter = firstLetter.toUpperCase();

        s = firstLetter + remainingLetters;
        System.out.println("Name: " + s);

    }
}
