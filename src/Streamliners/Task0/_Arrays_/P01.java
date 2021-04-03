package Streamliners.Task0._Arrays_;

//Program to Calculate Average Using Arrays

public class P01
{
    public static void main(String[] args)
    {
        double[] arr = {2, 3, 9, 5, 4};
        double sum = 0;
        for (int i = 0; i < 5; i++)
            sum = sum + arr[i];
        double average = (sum / 5);
        System.out.format("Average is %0.2f", average);
    }
}
