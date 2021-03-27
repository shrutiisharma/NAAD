package Streamliners.Task0._1_Introduction;

// Program to Swap Two Numbers

public class P06
{
    public static void main(String[] args)
    {
        int n1 = 4;
        int n2 = 9;

        //using temporary variable
        System.out.println("USING TEMPORARY VARIABLE \nBefore Swapping: \nn1 = " + n1 + "\nn2 = " + n2);
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After Swapping: \nn1 = " + n1 + "\nn2 = " + n2);

        n1 = 4; n2 = 9;
        //without using temporary variable
        System.out.println("WITHOUT USING TEMPORARY VARIABLE \nBefore Swapping: \nn1 = " + n1 + "\nn2 = " + n2);
        n1 = n1 - n2;
        n2 = n1 + n2;
        n1 = n2 - n1;
        System.out.println("After Swapping: \nn1 = " + n1 + "\nn2 = " + n2);
    }
}
