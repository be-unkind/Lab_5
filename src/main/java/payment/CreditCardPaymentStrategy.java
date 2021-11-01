package payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public String pay(double price){
        return "Paid " + price + " dollars with credit card";
    }
}
