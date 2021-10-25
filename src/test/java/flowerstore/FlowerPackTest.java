package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(13);
        flowerPack = new FlowerPack(flower, 3);
    }

    @Test
    void getPrice() {
        assertEquals(39, flowerPack.getPrice());
    }
}