package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products = new ArrayList<>();
    private double totalPrice = 0d;

    public Sale() {
    }

    public List<Product> getAllProducts() {
        return this.products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product getProduct(int index) {
        return this.products.get(index);
    }


    public void calculateTotal() {
        if (this.products.isEmpty()) {
            throw new EmptySaleException();
        }
        totalPrice = 0;
        for (Product product : this.products) {
            totalPrice += product.getPrice();
        }
    }


}
