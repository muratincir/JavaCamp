package business.abstracts;

import entities.concretes.Product;

import java.util.List;

public interface ProductService {
    // İş sınıfının interface'i

    void add(Product product);
    void update(Product product);
    void delete(Product product);
    List<Product> getAll();

}
