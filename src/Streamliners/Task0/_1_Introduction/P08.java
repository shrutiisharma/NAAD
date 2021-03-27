package Streamliners.Task0._1_Introduction;

//Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.Scanner;
public class P08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char ch = input.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Entered Letter is VOWEL");
        else
            System.out.println("Entered Letter is CONSONANT");
    }
}
