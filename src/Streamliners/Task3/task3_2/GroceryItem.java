package Streamliners.Task3.task3_2;

public class GroceryItem
{
    private String name;
    private int pricePerKg;

    GroceryItem(String n, int ppkg)
    {
        this.name = n;
        this.pricePerKg = ppkg;
    }

    public String getName()
    {
        return name;
    }

    public int getPricePerKg()
    {
        return pricePerKg;
    }
}
