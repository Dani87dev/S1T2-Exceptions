package n1exercici1;

import java.util.ArrayList;

public class Sale {

    ArrayList <Product> products = new ArrayList<Product>();
    private  double totalPrice=0d;

    public ArrayList<Product>  getProducts() {
        return products;
    }

    public void calculateTotal() throws EmptySalesException {
        if (products.isEmpty()) {
           throw new EmptySalesException();
        } else {
            totalPrice = 0;
            for(int i = 0; i < products.size(); i++) {
                    totalPrice += products.get(i).getPrice();
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
