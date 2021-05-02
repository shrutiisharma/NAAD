package Streamliners.Task3.task3_2;

public class GroceryCartItem extends GroceryItem
{
    private float price;
    private float quantity;

    GroceryCartItem(String name, int pricePerKg)
    {
        super(name, pricePerKg);
    }

    public float getPrice(){
        return price;
    }

    public float getQuantity(){
        return quantity;
    }

    @Override
    public String toString()
    {
        //“Sugar (₹35 X 3.0kg) = ₹105.0”
        return String.format("%s  (₹%d * %.2fkg) = ₹%.1f", this.getName(), this.getPricePerKg(), quantity, price);
    }

    public static float extractQuantity(String quantityStr)
    {
        String[] splitResult = quantityStr.split(" ");

        float replaceKgResult = Integer.parseInt(splitResult[0].replace("kg",""));
        float replaceGResult = Integer.parseInt(splitResult[1].replace("g",""));

        return replaceKgResult + replaceGResult / 1000;
    }

    public static GroceryCartItem createNew(GroceryItem item, String quantityStr)
    {
        GroceryCartItem cartItem = new GroceryCartItem(item.getName(), item.getPricePerKg());
        cartItem.quantity = GroceryCartItem.extractQuantity(quantityStr);
        cartItem.price = item.getPricePerKg() * cartItem.quantity;
        return cartItem;
    }
}
