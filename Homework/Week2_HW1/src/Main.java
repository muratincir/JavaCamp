import Abstract.CustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Murat","İncir","2000-12-10","11111111111");
        CustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(customer);

    }
}
