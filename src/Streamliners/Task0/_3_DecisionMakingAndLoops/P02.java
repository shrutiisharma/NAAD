package Streamliners.Task0._3_DecisionMakingAndLoops;

//Program to Display Fibonacci Series

public class P02
{
    public static void main(String[] args)
    {
        int n = 20, t1 = 0, t2 = 1;
        System.out.println(t1 + " " + t2 + " ");
        for (int i = 0; i <= n; i++)
        {
            int sum = t1 + t2;
            System.out.println(sum + " ");
            t1++;
            t2++;
        }
    }
}
