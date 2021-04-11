package Streamliners.Task1;

public class P01
{
    public static void main(String[] args)

    {
        System.out.println(modify("12332321", "2R3S1T4D"));
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
