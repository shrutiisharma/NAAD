package Streamliners.Task0;

//Program to add two integers

import java.util.Scanner;
public class P02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer 1:");
        int n1 = input.nextInt();
        System.out.println("Enter integer 2:");
        int n2 = input.nextInt();
        System.out.println("Sum = " + (n1 + n2) );
    }
}
