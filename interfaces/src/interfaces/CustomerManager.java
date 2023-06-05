package interfaces;

public class CustomerManager {

    // 3 farklı loglama yapılabilir (Database-file-sms) Hangi loglama yapılacağını parametre olarak main de verilir
    // loosly - tightly coupled
    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        System.out.println("Müşteri eklendi : " + customer.getFirstName());
        //this.logger.log(customer.getFirstName());
        // birden fazla loglama yapılır

        Utils.runLoggers(loggers, customer.getFirstName());

    }

    public void delete(Customer customer) {
        System.out.println("Müşteri silindi : " + customer.getFirstName());
        //this.logger.log(customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());
    }
}






















