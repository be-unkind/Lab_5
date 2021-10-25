package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    private Flower flower1;
    private Flower flower2;

    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;

    private Store store;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setPrice(13);
        flowerPack1 = new FlowerPack(flower1, 1);

        flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(15);
        flowerPack2 = new FlowerPack(flower2, 1);

        store = new Store();

        store.addPack(flowerPack1);
        store.addPack(flowerPack2);
    }

    @Test
    void containsPack() {
        assertTrue(store.containsPack(flowerPack1));
        assertTrue(store.containsPack(flowerPack2));
    }
}