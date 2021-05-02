package Streamliners.Task3.task3_1;

public class Product
{
    private String name;
    private int price;

    //defining empty constructor
    Product()
    {

    }

    //defining parameterized constructor
    Product(String n, int p)
    {
        this.name = n;
        this.price = p;
    }

    //defining getter
    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    //overriding methods
    @Override
    public String toString()
    {
        return String.format("Name : %s & Rs. %d", name, price);
    }

    @Override
    public boolean equals(Object obj)
    {
        Product product = (Product)obj;
        return this.name.equals(product.name) && this.price == product.price;
    }

    /*
    @Override
    public boolean equals(Object obj)
    {
        Product product = (Product)obj;
        boolean isEqual = this.name.equals(product.name) && this.price == product.price;
        return isEqual;
    }
     */
}
