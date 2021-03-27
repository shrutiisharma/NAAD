package Streamliners.Task0._1_Introduction;

// Program to Check Whether a Number is Even or Odd

import java.util.Scanner;
public class P07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number % 2 == 0) System.out.println("Number is Even");
        else System.out.println("Number is Odd");
    }
}
