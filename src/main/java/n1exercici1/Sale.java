package n1exercici1;

import java.util.ArrayList;

public class Sale {

    private ArrayList<Product> products = new ArrayList<Product>();
    private double totalPrice = 0d;

    public Sale() {
    }

    public ArrayList<Product> getAllProducts() {
        return this.products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product getProduct(int index) {
        return this.products.get(index);
    }


    public void calculateTotal()  {
        if (this.products.isEmpty()) {
            throw new EmptySaleException();
        } else {
            totalPrice = 0;
            for (Product product : this.products) {
                totalPrice += product.getPrice();
            }

        }
    }


}
