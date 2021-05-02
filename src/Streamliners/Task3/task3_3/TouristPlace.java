package Streamliners.Task3.task3_3;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace
{
    private String name;
    private String workingHour;     //String like “10:00AM to 5:00PM”
    private int entryTicketPrice;
    private int noOfRatings;
    private float starRating;
    private List<String> famousFor;

    //getters of data members
    public String getName() {
        return name;
    }

    public String getWorkingHour() {
        return workingHour;
    }

    public int getEntryTicketPrice() {
        return entryTicketPrice;
    }

    public int getNoOfRatings() {
        return noOfRatings;
    }

    public float getStarRating() {
        return starRating;
    }

    public List<String> getFamousFor() {
        return famousFor;
    }

    TouristPlace(String n, String wH, int etp)
    {
        famousFor = new ArrayList<>();
        noOfRatings = 0;
        starRating = 0;
    }

    public void rate(int stars)
    {
        //((Overall Rating * Total no of Ratings) + new Rating) / (Total Rating + 1)
        starRating = starRating * noOfRatings + stars;
        noOfRatings++;
        starRating /= noOfRatings;
    }

    public TouristPlace addFamousFor(String s)
    {
        famousFor.add(s);
        return this;
    }

    public boolean isPlaceOpen()
    {
        return true;
    }
}
