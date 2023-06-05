package dataAccess.abstracts;

import entities.concretes.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id);        // verilen id ye sahip ürünü getirecek
    List<Product> getAll();     // ürünün arraylistini getirir (aramaya hp yazmak gibi)

}
