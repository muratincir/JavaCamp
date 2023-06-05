import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.AbcProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Integer>  sayilar = new ArrayList<>();

        // Bir projede Entityler hariç new kullanılıyor ise ileride problem yaratır !!!
        // Test aşaması -> kötü kod
        // Spring IoC ile çözülecek
        // ProductService productService = new ProductManager(new HibernateProductDao()); // hibernateden abc ye geçildi
        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product = new Product(2,2,"Hp",199.99,50);
        productService.add(product);
    }
}