package Streamliners.Task1;

import java.util.HashMap;

public class P02
{
    public static void main(String[] args)
    {
        System.out.println(totalWeight("EEDBCCAB", new int[] {4, 3, 2, 1, 5}));
    }

    private static int totalWeight(String s, int[] weights)
    {
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for (int i = 0; i < weights.length; i++)
        {
            char ch = 'A';
            ch += i;
            hashMap.put(ch, weights[i]);
        }
        int totalWeight = 0;
        for (int i = 0; i <s.length() ; i++)
            totalWeight+=hashMap.get(s.charAt(i));

        return totalWeight;
    }
}
