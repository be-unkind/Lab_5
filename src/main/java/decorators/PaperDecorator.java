package decorators;

import flowerstore.Item;

public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice(){
        return (13 + super.getPrice());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "(paper decor)";
    }
}
