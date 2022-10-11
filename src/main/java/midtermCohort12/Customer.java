package midtermCohort12;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends User{
    private int rewardPoints;
    private double accountBalance;
    private ArrayList<String> address;
    private Size size;
    private Product[] products;


    public Customer(String username, String passowrd, int rewardPoints, double accountBalance, ArrayList<String> address, Size size, Product[] products) {
        super(username, passowrd);
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.address = address;
        this.size = size;
        this.products = products;
    }

    public Customer(String username, String passowrd, int rewardPoints, double accountBalance,  Size size) {
        super(username, passowrd);
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.size = size;

    }



    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance<0){
            System.out.println("Can't give user a negative balance");
        }else {
            this.accountBalance=accountBalance;
        }
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void useRewardPoints(int rewardPoint){

        rewardPoints=rewardPoints-rewardPoint;
        System.out.println("You Just used " +rewardPoint+" points and now you have "+rewardPoints+" points left");

    }


    @Override
    public void print() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "rewardPoints=" + rewardPoints +
                ", accountBalance=" + accountBalance +
                ", address=" + address +
                ", size=" + size +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
