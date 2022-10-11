package midtermCohort12;

public class App {

    public static void printAllPrintableObjects(IPrint[] iPrints){

        System.out.println();
    }

    public static void consumeConsumables(Consumable[] consumables){
        System.out.println();
    }
    public static void getTotalPriceOfCustomerProducts(Customer customer){
    //    customer.getProducts();
        System.out.println();
    }

    public static String getSecondaryAddressOfCustomer(Customer customer){
        String addy=" "+customer.getAddress();
//        for (int i = 0; i < customer.getAddress(); i++) {
//        }

        return addy;
    }





}
