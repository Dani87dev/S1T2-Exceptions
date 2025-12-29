package n1exercici1;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if ( price <0 ) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

}
