package Streamliners.Task2;

import java.util.Scanner;

public class P03
{

    public static void main(String[] args)
    {
        startGame("SHAMBHO");
    }

    public static void startGame(String s)
    {
        String originalString = s;
        int noOfConsonants = 0;
        for (char i = 0; i < s.length(); i++)
        {
            if (isConsonant(s.charAt(i)))
            {
                s = s.replace(s.charAt(i), '_');
                noOfConsonants++;
            }
        }
        int noOfChances = noOfConsonants + 3;
        System.out.println("Guess The Word: " + s);
        System.out.println("No. of chances you get: " + noOfChances);
        System.out.println("Let's Play!");

        Scanner sc = new Scanner(System.in);
        char guess;

        while (noOfChances-- != 0)
        {
            System.out.println("\nWord: " + s);
            System.out.println("Chances: " + (noOfChances + 1));
            System.out.print("Guess: ");
            guess = sc.next().charAt(0);
            guess = (char) toUpper(guess);

            if (originalString.indexOf(guess) != -1)
            {
                int characterFoundCount = 0;
                for (int i = 0; i < originalString.length(); i++)
                {
                    if (originalString.charAt(i) == guess)
                    {
                        characterFoundCount++;
                        s = s.substring(0, i) + guess + s.substring(i + 1);
                    }
                }
                System.out.println("character found " + characterFoundCount + " time(s).");
            }
            else
                System.out.println("Oh! Character not found.");

            if (s.equals(originalString))
            {
                System.out.println("\nWord: " + s);
                System.out.println("You win the game.");
                return;
            }
        }
        System.out.println("\nYou loose the game.");
    }

    private static boolean isConsonant(char ch)
    {
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> false;
            default -> true;
        };
    }

    public static int toUpper(int asciiValue) {
        if (asciiValue > 96 && asciiValue < 123)
            return asciiValue-32;
        return asciiValue;
    }
}
