package Streamliners.Task1;

public class P03
{
    public static void main(String[] args)
    {
        System.out.println(isDirectlyProportional(new int[] {1,2,3,4}, new int[] {10,20,30,40}));
    }

    private static boolean isDirectlyProportional(int[] x, int[] y)
    {
        for (int i = 1; i < x.length; i++)
        {
            if (x[i] > x[i-1])
            {
                if (y[i] < y[i-1])
                    return false;
            }
            else if (x[i] < x[i-1])
            {
                if (y[i] > y[i-1])
                    return false;
            }
            else
            {
                if (y[i] != y[i-1])
                    return false;
            }
        }
        return true;
    }
}
