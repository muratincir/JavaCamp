package oopIntro;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "HP V12", 1000, "16GB Ram", 10);

        Product product2 = new Product(2, "HP V14", 2000, "16GB Ram", 20);

        Product product3 = new Product(3, "HP V16", 3000, "32GB Ram", 30);


        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println("id :" + product.getId() + " name :" + product.getName() + " detail :" + product.getDetail() + " unitPrice :" + product.getUnitPrice());
        }

        System.out.println("İndirimli Fiyat : "+product1.getUnitPriceAfterDiscount());
        System.out.println("İndirimli Fiyat : "+product2.getUnitPriceAfterDiscount());
        System.out.println("İndirimli Fiyat : "+product3.getUnitPriceAfterDiscount());

        Category category1 = new Category(1, "Bilgisayar");
        Category category2 = new Category(2, "Ev / Bahçe");

        Category[] categories = {category1, category2};

        for (Category category : categories) {
            System.out.println("Category id :" + category.getId() + " Category name :" + category.getName());
        }

        // Don't repeat yourself
        // SOLID
        // Özellik tutucu classlar
        // İş yapan classlar (metot == Manager)

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
    }
}