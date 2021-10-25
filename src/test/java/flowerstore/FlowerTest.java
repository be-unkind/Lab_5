package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP);
        flower.setPrice(15);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(15, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.TULIP, flower.getFlowerType());
    }
}