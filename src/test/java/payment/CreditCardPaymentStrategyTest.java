package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
    String result = "Paid 15.0 dollars with credit card";

    @BeforeEach
    void setUp() {
        int pay = 15;
    }

    @Test
    void pay() {
        assertEquals(result, creditCardPaymentStrategy.pay(15));
    }
}