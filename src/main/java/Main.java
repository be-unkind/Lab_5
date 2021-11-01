import decorators.BasketDecorator;
import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowerstore.*;
import payment.CreditCardPaymentStrategy;
import payment.PayPalPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flower flower1;
        Flower flower2;

        Item flower = new Flower(FlowerType.CHAMOMILE);
        flower = new BasketDecorator(flower);
        System.out.println(flower.getDescription());

        DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();
        PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();

        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        System.out.println(creditCardPaymentStrategy.pay(15));

        PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();
        System.out.println(payPalPaymentStrategy.pay(15));

        FlowerPack flowerPack1;
        FlowerPack flowerPack2;

        FlowerBucket flowerBucket = new FlowerBucket();

        flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setPrice(13);
        flowerPack1 = new FlowerPack(flower1, 1);

        flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(15);
        flowerPack2 = new FlowerPack(flower2, 1);

        List<Item> items = new ArrayList<>();
        items.add(flower1);
        items.add(flower2);

        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);

        System.out.println(flowerBucket.getPrice());

        System.out.println(dhlDeliveryStrategy.delivery(items));
        System.out.println(postDeliveryStrategy.delivery(items));


    }
}
