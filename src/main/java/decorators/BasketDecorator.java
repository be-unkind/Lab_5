package decorators;

import flowerstore.Item;

public class BasketDecorator extends ItemDecorator{

    public BasketDecorator(Item item) {
        super(item);
    }

    public double getPrice(){
        return (4 + super.getPrice());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "(basket included)";
    }
}
