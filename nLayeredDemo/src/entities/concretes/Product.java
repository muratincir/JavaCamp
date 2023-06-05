package entities.concretes;

import entities.abstracts.Entity;

public class Product implements Entity {

    // özellik tutan sınıflar (Veri tabanı nesnesi)
    // nesnenin hangi gruba dahil olduğu belirtilir (Avantajlı durumlar oluşturur !!!) classlar çıplak kalmayacak
    // Bir interface veya base ile bağlanması gerekiyor

    private int id;
    private int categoryId;
    private String name;
    private double unityPrice;
    private int unitsinStock;

    public Product(){

    }

    public Product(int id, int categoryId, String name, double unityPrice, int unitsinStock) {
        super();
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unityPrice = unityPrice;
        this.unitsinStock = unitsinStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnityPrice() {
        return unityPrice;
    }

    public void setUnityPrice(double unityPrice) {
        this.unityPrice = unityPrice;
    }

    public int getUnitsinStock() {
        return unitsinStock;
    }

    public void setUnitsinStock(int unitsinStock) {
        this.unitsinStock = unitsinStock;
    }
}
