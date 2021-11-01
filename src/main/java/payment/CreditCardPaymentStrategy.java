package payment;

import flowerstore.Flower;
import flowerstore.FlowerType;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public boolean pay(double price){
        System.out.println("Paid " + price + " dollars with credit card");
        Flower flower = new Flower(FlowerType.TULIP);
        return true;
    }
}
