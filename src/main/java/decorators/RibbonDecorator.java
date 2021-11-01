package decorators;

import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    public RibbonDecorator(Item item) {
        super(item);
    }

    public double getPrice(){
        return (40 + super.getPrice());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "(ribbon decor)";
    }
}
