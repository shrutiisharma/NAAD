package Streamliners.Task0._2_TypeConversion;

//Program to Convert string to integer

public class P01
{
    public static void main(String[] args)
    {
        String a = "23", b = "hello", c = "56";

        //method 1
        int n1 = Integer.parseInt(a);
        System.out.println("n1 = " + n1);

        //method 2 ->shows error
        //int n2 = Integer.parseInt(b);
        //System.out.println("n2 = " + n2);

        //method 3
        //int n3 = Integer.valueOf(c);
        //System.out.println("n3 = " + n3);
    }
}
