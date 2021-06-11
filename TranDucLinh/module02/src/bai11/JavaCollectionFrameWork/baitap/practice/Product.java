package bai11.JavaCollectionFrameWork.baitap.practice;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private String Description;



    public Product(int id, String nameProduct, double price, String Description) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.Description = Description;

    }
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", Description='" + Description + '\'' +
                '}';
    }
}
