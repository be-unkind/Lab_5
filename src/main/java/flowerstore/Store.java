package flowerstore;

import java.util.ArrayList;
import java.util.List;


public class Store {

    List<Flower> flowers = new ArrayList<Flower>();
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public void addPack(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }

    public void addBucket(FlowerBucket flowerBucket){
        flowerBuckets.add(flowerBucket);
    }

    public boolean containsFlower(Flower flower){
        return flowers.contains(flower);
    }

    public boolean containsPack(FlowerPack flowerPack){
        return flowerPacks.contains(flowerPack);
    }

    public boolean containsBucket(FlowerBucket flowerBucket){
        return flowerPacks.contains(flowerBucket);
    }

}
