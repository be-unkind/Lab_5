package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    private Flower flower1;
    private Flower flower2;

    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;

    private FlowerBucket flowerBucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setPrice(13);
        flowerPack1 = new FlowerPack(flower1, 1);

        flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(15);
        flowerPack2 = new FlowerPack(flower2, 1);

        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);
    }

    @Test
    void getPrice() {
        assertEquals(28, flowerBucket.getPrice());
    }
}