package Streamliners.Task0._5_Strings;

//Program to Check if a String is Numeric

public class P03
{
    public static void main(String[] args)
    {
        String s = "15545";
        boolean isNumeric = true;

        try {
            Double num = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            isNumeric = false;
        }

        if(isNumeric)
            System.out.println(s + " is a number");
        else
            System.out.println(s + " is not a number");
    }
}

