package delivery;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public boolean delivery(String delivery) {
        System.out.println("You have ordered post delivery");
        return true;
    }
}
