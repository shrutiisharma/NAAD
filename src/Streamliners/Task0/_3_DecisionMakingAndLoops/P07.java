package Streamliners.Task0._3_DecisionMakingAndLoops;

//Program to Check Whether a Number is Palindrome or Not

public class P07
{
    public static void main(String[] args)
    {
        int n = 1221;
        int original, reverse = 0;
        original = n;
        while(n!=0)
        {
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }
        if(original == reverse)
            System.out.println("The number is palindrome.");
        else
            System.out.println("The number is not palindrome.");
    }
}
