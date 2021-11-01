package delivery;

import flowerstore.Item;
import java.util.List;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String delivery(List<Item> items) {

        return "Your order " + items +" will be delivered by DHL";
    }
}
