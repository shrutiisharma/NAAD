package Streamliners.Task0._3_DecisionMakingAndLoops;

//Program to Make a Simple Calculator Using switch case

import java.util.Scanner;
public class P08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = 10, b = 2;
        System.out.print("Enter operator(+ or - or * or /): ");
        char operator = input.next().charAt(0);
        switch (operator)
        {
            case '+':
            {
                System.out.println("10 + 2 = " + (a + b));
                break;
            }
            case '-':
            {
                System.out.println("10 - 2 = " + (a - b));
                break;
            }
            case '*':
            {
                System.out.println("10 * 2 = " + (a * b));
                break;
            }
            case '/':
            {
                System.out.println("10 / 2 = " + (a / b));
                break;
            }
            default:
                System.out.print("Invalid operator");
        }
    }
}
