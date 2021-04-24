package Streamliners.Task2;

import java.util.ArrayList;
import java.util.List;
public class P01
{
    public static void main(String[] args)
    {
        System.out.println(getList("1;2;3;4"));
    }

    private static List<Integer> getList(String s)
    {
        List<Integer> result = new ArrayList<>();
        String[] str = s.split(";");
        for (String x: str)
            result.add(Integer.parseInt(x));

        return result;
    }
}
