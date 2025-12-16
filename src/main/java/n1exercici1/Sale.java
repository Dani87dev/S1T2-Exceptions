package n1exercici1;

import java.util.ArrayList;

public class Sale {

    private ArrayList <Product> products = new ArrayList<Product>();
    private  double totalPrice=0d;

    public Sale() {
    }

    public ArrayList<Product>  getProducts() {
        return products;
    }


    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
           throw new EmptySaleException();
        } else {
            totalPrice = 0;
            for(Product product : products) {
                totalPrice += product.getPrice();
            }

        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(int index) {
        return products.get(index);
    }


}
