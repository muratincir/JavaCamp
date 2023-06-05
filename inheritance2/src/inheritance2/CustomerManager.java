package inheritance2;

public class CustomerManager {
    // Müşteri işlerini yapılacak sınıf
    public void add(Logger logger){          // Müşteri eklenecek , loglama yapılacak
        System.out.println("Müşteri eklendi");
        logger.log();
    }
}
