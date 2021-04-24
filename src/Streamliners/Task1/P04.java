package Streamliners.Task1;

import java.util.*;

public class P04
{
    public static void main(String[] args)

    {
        String str = "12332321";
        String replacements = "2R3S1T4D";
        if(customException(str, replacements) == false)
        {
            System.out.println("INVALID replacement string.");
            return;
        }
        System.out.println("The replaced string is " + modify(str, replacements));
    }

    public static boolean customException(String s, String replacements)
    {
        Set<Character> numericStringSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
            numericStringSet.add(s.charAt(i));

        ArrayList<Character> numericStringArray = new ArrayList<>(numericStringSet);
        Collections.sort(numericStringArray);

        ArrayList<Character> numericReplacementsArray = new ArrayList<>();
        for (int i = 0; i < replacements.length(); i+=2)
            numericReplacementsArray.add(replacements.charAt(i));

        Collections.sort(numericReplacementsArray);

        if (!numericReplacementsArray.equals(numericStringArray))
        {
            return false;
        }

        for (int i = 1; i < replacements.length(); i += 2)
        {
            if (Character.isLetter(replacements.charAt(i)))
            {
                continue;
            }
            return false;
        }
        return true;
    }

    private static String modify(String s, String replacements)
    {
        StringBuilder newString = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < replacements.length(); j++)
            {
                if (s.charAt(i) == replacements.charAt(j))
                {
                    char ch = replacements.charAt(j+1);
                    newString.append(ch);
                }
            }
        }
        return newString.toString();
    }
}
