package payment;

import flowerstore.Flower;
import flowerstore.FlowerType;

public class PayPalPaymentStrategy implements Payment{

    @Override
    public boolean pay(double price) {
        System.out.println("Paid " + price + " dollars with PayPal");
        Flower flower = new Flower(FlowerType.TULIP);
        return true;
    }
}
