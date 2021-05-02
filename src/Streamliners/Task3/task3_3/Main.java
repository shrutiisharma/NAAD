package Streamliners.Task3.task3_3;

public class Main
{
    public static void main(String[] args)
    {
        TouristPlace nahargarhFort = new TouristPlace("Nahargarh Fort", "10:00AM to 5:00PM", 10);

        nahargarhFort.addFamousFor("View").addFamousFor("History");

        nahargarhFort.rate(1);
        nahargarhFort.rate(4);
        nahargarhFort.rate(3);
        nahargarhFort.rate(5);
        System.out.println("Rating: " + nahargarhFort.getStarRating());
    }
}
