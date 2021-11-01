package flowerstore;

public abstract class Item {

    private double price;
    public abstract double getPrice();
    public abstract String getDescription();

    public void setPrice(double price){
        this.price = price;
    }
}
