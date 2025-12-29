package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sale {

    private List<Product> products = new ArrayList<>();
    private double totalPrice = 0.0;

    public Sale() {
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(this.products);
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
