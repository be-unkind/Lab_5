package order;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;
import users.Receiver;
import users.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Item flower1 = new Flower(FlowerType.CHAMOMILE);
    Item flower2 = new Flower(FlowerType.TULIP);
    List<Item> items = new LinkedList<>();
    List<User> users = new LinkedList<>();
    Receiver user1 = new Receiver();
    Order order = new Order();

    @BeforeEach
    void setUp() {
        flower1.setPrice(10);
        flower2.setPrice(15);
        order.addItem(flower1);
        order.addItem(flower2);
        order.addUser(user1);
        order.notifyUsers();
    }

    @Test
    void notifyUsers() {
        assertEquals("notification received", user1.getStatus());
    }

    @Test
    void totalPrice() {
        assertEquals(25, order.totalPrice());
    }

    @Test
    void success() {
        assertEquals("Order is successful", order.success());
    }
}