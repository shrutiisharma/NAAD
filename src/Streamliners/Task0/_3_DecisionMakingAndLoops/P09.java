package Streamliners.Task0._3_DecisionMakingAndLoops;

//Program to Count the Number of Vowels and Consonants in a Sentence

public class P09
{
    public static void main(String[] args)
    {
        String s = "my name is xyz.";
        int vowel = 0, consonant = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                vowel++;
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                consonant++;
        }
        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonant);
    }
}
