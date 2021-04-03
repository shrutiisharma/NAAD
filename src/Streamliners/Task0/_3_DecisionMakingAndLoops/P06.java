package Streamliners.Task0._3_DecisionMakingAndLoops;

//Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;
public class P06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number >= 0) System.out.println("Number is positive");
        else System.out.println("Number is negative");
    }
}
