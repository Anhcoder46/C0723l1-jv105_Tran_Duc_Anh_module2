package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String describe; // mô tả

    public Product(int id, String name, double price, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "; Name: " + name +
                "; Price: " + price +
                "; Describe: " + describe;
    }
}
