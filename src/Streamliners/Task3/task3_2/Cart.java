package Streamliners.Task3.task3_2;

import java.util.ArrayList;

public class Cart
{
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

    Cart()
    {
        cartItems = new ArrayList<>();
        totalAmount = 0;
    }

    public Cart add(GroceryCartItem item)
    {
        cartItems.add(item);
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Cart{ \n\tgroceryCartItems = [");
        for (int i=0;i< cartItems.size();i++)
        {
            sb.append("\n\t\t" + cartItems.get(i));
            this.totalAmount+= cartItems.get(i).getPrice();
        }
        sb.append("\n\t],\n\tTotal Amount = ₹" + this.totalAmount + "\n}");

        return sb.toString();
    }
}
