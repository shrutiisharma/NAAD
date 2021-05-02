package Streamliners.Task3.task3_3;

import java.util.ArrayList;
import java.util.List;

public class City
{
    String name;
    String state;
    List<TouristPlace> touristPlaces;

    City(String name_, String state_)
    {
        touristPlaces = new ArrayList<>();
    }
}
