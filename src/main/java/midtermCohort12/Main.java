package midtermCohort12;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        Admin admin1 = new Admin("Ron", "dog321");



        ArrayList<String> address=new ArrayList<>();
        address.add("231 Main St, New Castle,DE 19720");
        address.add("12 Real News Lane, Dover, DE 19901");


        Product IceCream=new IceCream("Vanilla",3.0,Size.S);
        Customer customer1 = new Customer("Fran", "random2!", 100, 50.0, address,Size.M,new Product[]{IceCream});
        Customer customer2 = new Customer("Craig", "grows444", 30, 55.00,address, Size.X,new Product[]{IceCream});
        Customer customer3 = new Customer("Selena", "roses777", 100, 345.0, Size.L);


        customer3.setAccountBalance(100.0);
        System.out.println("===Get and print out customer1's balance====");
        System.out.println(customer3.getAccountBalance());

        System.out.println("\n===useRewardPoints===");
        customer1.useRewardPoints(10);

        System.out.println("\n===getSecondaryAddressOfCustomer of customer1===");
        System.out.println(App.getSecondaryAddressOfCustomer(customer1));

        System.out.println("\n===Print customer1's info with the print() method===");
        System.out.println(customer1);



    }
}
