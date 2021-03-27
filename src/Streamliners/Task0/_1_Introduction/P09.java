package Streamliners.Task0._1_Introduction;

//Program to Find the Largest Among Three Numbers

public class P09
{
    public static void main(String[] args)
    {
        int n1 = 4, n2= 7, n3 = 2;
        if (n1 > n2 && n1 > n3) System.out.println("Greatest number: " + n1);
        else if (n2 > n1 && n2 > n3) System.out.println("Greatest number: " + n2);
        else if (n3 > n1 && n3 > n2) System.out.println("Greatest number: " + n3);
    }
}
