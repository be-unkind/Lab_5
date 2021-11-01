package payment;

import flowerstore.Flower;
import flowerstore.FlowerType;

public class PayPalPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        return "Paid " + price + " dollars with PayPal";
    }
}
