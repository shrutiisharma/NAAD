package Streamliners.Task0._2_TypeConversion;

//Program to Convert integer to string

public class P02
{
    public static void main(String[] args)
    {
        int n1 = 3;
        int n2 = 5;
        int n3 = 9;
        int n4 = 6;

        //method 1
        String s1 = String.valueOf(n1);
        System.out.println(s1);

        //method 2
        String s2 = Integer.toString(n2);
        System.out.println(s2);

        //method 3
        String s3 = "" + n3;
        System.out.println(s3);

        //method 4
        String s4 = String.format("%d", n4);
        System.out.println(s4);
    }
}
