package Streamliners.Task0._1_Introduction;

//Program to Remove All Whitespaces from a String

public class P12
{
    public static void main(String[] args)
    {
        String sentence = "H  e l l o Th e r   e  !";
        System.out.println("Original sentence: " + sentence);
        sentence = sentence.replaceAll("\\s","");
        System.out.println("Final sentence: " + sentence);

    }
}
