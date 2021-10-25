import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;
import flowerstore.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower flower1;
        Flower flower2;

        FlowerPack flowerPack1;
        FlowerPack flowerPack2;

        FlowerBucket flowerBucket = new FlowerBucket();

        flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setPrice(13);
        flowerPack1 = new FlowerPack(flower1, 1);

        flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(15);
        flowerPack2 = new FlowerPack(flower2, 1);

        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);

        System.out.println(flowerBucket.getPrice());
    }
}
