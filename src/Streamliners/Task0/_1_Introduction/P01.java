package Streamliners.Task0._1_Introduction;

//Program to print an integer (entered by the user)

import java.util.Scanner;
public class P01
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        System.out.println("You entered: " + number);
    }
}
