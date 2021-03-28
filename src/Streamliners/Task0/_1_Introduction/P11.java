package Streamliners.Task0._1_Introduction;

//Program to Find the Frequency of Character in a String

public class P11
{
    public static void main(String[] args)
    {
        String str = "i like the night sky.";
        char ch = 'k';
        int count = 0;
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++)
        {
            if (ch == str.charAt(i))    count++;
        }
        System.out.println("Frequency of k is " + count);
    }
}

//note: upper case letters are not read in this.