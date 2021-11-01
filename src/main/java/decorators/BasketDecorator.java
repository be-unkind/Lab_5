package decorators;

import flowerstore.Item;

public class BasketDecorator extends ItemDecorator{
    private Item item;

    public BasketDecorator(Item item) {
        super(item);
    }

    public double getPrice(){
        return (4 + item.getPrice());
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
