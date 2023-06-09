package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    @Override
    public void save(Customer customer){
        if(this.customerCheckService.checkIfRealPerson(customer))
            super.save(customer);
        else
            System.out.println("Not a valid person !!!");
    }



}
