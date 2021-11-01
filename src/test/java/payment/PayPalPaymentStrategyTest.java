package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {

    PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();
    String result = "Paid 15.0 dollars with PayPal";

    @BeforeEach
    void setUp() {
        int pay = 15;
    }

    @Test
    void pay() {
        assertEquals(result, payPalPaymentStrategy.pay(15));
    }
}