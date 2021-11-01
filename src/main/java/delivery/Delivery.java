package delivery;

import flowerstore.Item;
import java.util.List;

public interface Delivery {
    String delivery(List<Item> items);
}
