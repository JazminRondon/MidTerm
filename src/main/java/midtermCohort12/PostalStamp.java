package midtermCohort12;

public class PostalStamp extends Product implements LickAble,IPrint{
    private int amount;

    public PostalStamp(String name, double price, Size size, int amount) {
        super(name, price, size);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean safeToLick() {
        return false;
    }
}
