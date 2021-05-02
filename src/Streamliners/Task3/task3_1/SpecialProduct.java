package Streamliners.Task3.task3_1;

public class SpecialProduct extends Product
{
    private int regularPrice;
    private int percentageOff;

    SpecialProduct(String name, int price)
    {
        super(name, price);
    }

    //overriding method
    @Override
    public String toString()
    {
        return String.format("Name: %s   Rs. %d   Regular Price: Rs. %d   PercentageOff: %d ", this.getName(), this.getPrice(), regularPrice, percentageOff);
    }

    //static method
    public static SpecialProduct applyOffOnProduct(Product product,int percentageOff)
    {
        int discountedPrice = product.getPrice() - product.getPrice() * percentageOff / 100;

        SpecialProduct specialProduct = new SpecialProduct(product.getName(), discountedPrice);

        specialProduct.regularPrice = product.getPrice();
        specialProduct.percentageOff = percentageOff;

        return specialProduct;
    }
}
