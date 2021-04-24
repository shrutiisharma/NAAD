package Streamliners.Task2;

import java.util.Arrays;
import java.util.HashMap;

public class P02 {

    public static void main(String[] args)
    {
        System.out.println(getOccurrencesHashMap("9;2;2;2;3;5"));
    }

    private static HashMap<Integer, Integer> getOccurrencesHashMap(String s)
    {
        String[] str = s.split(";");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++)
            array[i] = Integer.parseInt(str[i]);
        Arrays.sort(array);

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++)
        {
            if(hashMap.containsKey(array[i]))
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            else
                hashMap.put(array[i], 1);
        }
        return hashMap;
    }
}