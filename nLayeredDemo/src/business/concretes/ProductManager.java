package business.concretes;

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

import java.util.List;

public class ProductManager implements ProductService {
    // iş yapan sınıf

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        // iş kodları yazılır
        if (product.getCategoryId() == 1) {
            System.out.println("Bu katagoride ürün kabul edilmiyor");
            return;
        }
       // HibernateProductDao dao = new HibernateProductDao(); // çalışır AMA tüm sistemi BAĞLARIZ alternatif sistem dahil olamaz.
       // İş katmanında veri tabanına gidemezsiniz !!! -> unit testing (Kısıtlı olarak bağlanabilir)

        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi : "+product.getName());
    }

    @Override
    public void update(Product product) {
    }

    @Override
    public void delete(Product product) {
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
