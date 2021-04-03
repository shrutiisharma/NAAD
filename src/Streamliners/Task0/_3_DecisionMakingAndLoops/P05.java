package Streamliners.Task0._3_DecisionMakingAndLoops;

//Program to Reverse a Number

public class P05
{
    public static void main(String[] args)
    {
        int n = 123456;
        int reverse = 0;
        while(n != 0)
        {
            reverse = (n % 10) + (reverse * 10);
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
