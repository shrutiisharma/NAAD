package Streamliners.Task0._4_Arrays_;

//Program to Concatenate Two Arrays

public class P02
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9};
        int length_arr1 = arr1.length;
        int length_arr2 = arr2.length;
        int[] result = new int[length_arr1 + length_arr2];

        for (int i = 0; i < length_arr1; i++)
            result[i] = arr1[i];
        for (int i = length_arr1; i < (length_arr1 + length_arr2); i++)
            result[i] = arr2[i - length_arr1];

        for (int i = 0; i < (length_arr1 + length_arr2); i++)
            System.out.print(result[i] + " ");
    }
}
