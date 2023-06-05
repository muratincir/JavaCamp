package inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer murat = new IndividualCustomer();
        murat.customerNumber="12345";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber="67890";

        CustomerManager customerManager = new CustomerManager();
        // customerManager.add(hepsiBurada);
        // customerManager.add(murat);
        Customer[] customers = {murat,hepsiBurada};
        customerManager.addMultiple(customers);
    }
}