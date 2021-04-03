package Streamliners.Task0._3_DecisionMakingAndLoops;

//Java Code To Create Pyramid and Pattern

//Program to print half pyramid using *
//*
//* *
//* * *
//* * * *
//* * * * *

public class P11
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
