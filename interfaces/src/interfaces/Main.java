package interfaces;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new SmsLogger(),new DatabaseLogger(),new EmailLogger(),new FileLogger()};
        Logger[] loggers1 = {new FileLogger(),new EmailLogger()};
        Customer customer = new Customer(1,"Engin","Demiroğ");
        CustomerManager customerManager = new CustomerManager(loggers); // Tüm loglamaları yapar
        CustomerManager customerManager1 = new CustomerManager(loggers1); // 2 tane loglama yapar
        customerManager.add(customer);

    }
}
