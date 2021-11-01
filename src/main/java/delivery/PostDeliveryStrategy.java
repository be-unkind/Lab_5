package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String delivery(List<Item> items) {
        return "Your order " + items + " will be delivered py post";

    }
}
