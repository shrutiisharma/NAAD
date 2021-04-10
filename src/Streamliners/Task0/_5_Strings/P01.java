package Streamliners.Task0._5_Strings;

//Program to Convert String to Date

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class P01
{
    public static void main(String[] args)
    {
        // yyyy-mm-dd
        String string = "2001-02-18";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
