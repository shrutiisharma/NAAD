package Streamliners.Task0._3_DecisionMakingAndLoops;

//Program to Count Number of Digits in an Integer

public class P04
{
    public static void main(String[] args)
    {
        int n = 51548452 ;
        int count = 0;
        while (n != 0)
        {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
