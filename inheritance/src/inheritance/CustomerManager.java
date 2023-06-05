package inheritance;

public class CustomerManager {
    // Müşteri yönetecek kısım (ekle-çıkar-sil)
    public void add(Customer customer){
        // Customer extends eden sınıfların referanslarını tutabilir !!!
        System.out.println(customer.customerNumber+" Kaydedildi");
    }

    // bulk insert
    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }
}

