package midtermCohort12;

public class IceCream extends Product implements Consumable,LickAble{

    private Size size;

    public IceCream(String name, double price, Size size) {
        super(name, price, size);

    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void consume() {

    }

    @Override
    public boolean safeToLick() {
        return false;
    }
}
