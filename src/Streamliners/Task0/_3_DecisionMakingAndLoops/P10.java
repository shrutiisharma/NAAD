package Streamliners.Task0._3_DecisionMakingAndLoops;

//Java Program to Sort Elements in Lexicographical Order (Dictionary Order)

public class P10
{
    public static void main(String[] args)
    {
        String[] words = {"hello", "you", "there", "here"};
        for(int i = 0; i < (words.length - 1); i++)
        {
            for (int j = (i + 1); j < words.length; j++)
            {
                if (words[i].compareTo(words[j]) > 0)
                {
                    String temp;
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (String word : words) System.out.print(word + " ");
    }
}
