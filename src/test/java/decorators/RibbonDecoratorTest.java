package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    Item flower = new Flower(FlowerType.CHAMOMILE);
    String result = "CHAMOMILE(ribbon decor)";

    @BeforeEach
    void setUp() {
        flower.setPrice(10);
        flower = new RibbonDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(50, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals(result, flower.getDescription());
    }
}