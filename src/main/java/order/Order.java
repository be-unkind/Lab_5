package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;
import users.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
    Payment payment;
    Delivery delivery;
    private List<User> users = new LinkedList<>();
    private List<Item> items = new LinkedList<>();
    double price = 0;

    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public Order(){

    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void notifyUsers(){
        for (User user: users){
            user.update("notification received");
        }
    }

    public void order(){
        notifyUsers();
    }

    public double totalPrice() {

        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public void deliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public void paymentStrategy(Payment payment){
        this.payment = payment;
    }

    public String success(){
        return "Order is successful";
    }
}
