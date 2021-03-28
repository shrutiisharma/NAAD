package Streamliners.Task0._3_DecisionMakingAndLoops;

//Program to Check Whether a Character is Alphabet or Not

public class P01
{
    public static void main(String[] args)
    {
        char random_character = 'p';
        if ((random_character >= 'a' && random_character <= 'z') || (random_character >= 'A' && random_character <= 'Z'))
            System.out.println(random_character + " is an Alphabet");
        else
            System.out.println(random_character + " is not an Alphabet");
    }
}
