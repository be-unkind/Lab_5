package delivery;

import flowerstore.Flower;
import flowerstore.FlowerPack;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    List<Item> items = new ArrayList<>();
    String result = "Your order [Flower(price=13.0, sepalLength=0.0, color=null, flowerType=CHAMOMILE), Flower(price=15.0, sepalLength=0.0, color=null, flowerType=TULIP)] will be delivered by DHL";
    DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();

    @BeforeEach
    void setUp() {
        Flower flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setPrice(13);

        Flower flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(15);

        items.add(flower1);
        items.add(flower2);

    }

    @Test
    void delivery() {
        assertEquals(result, dhlDeliveryStrategy.delivery(items));
    }
}