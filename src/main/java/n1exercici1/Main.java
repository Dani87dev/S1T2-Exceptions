package n1exercici1;

public class Main {

    public static void main (String [] args) {


        Product Playstation = new Product("Playstation5", 499.99);
        Product Xbox = new Product("Xbox", 349.95);
        Product Switch2 = new Product ("Switch2", 435.50);

        Sale venta1 = new Sale();

        venta1.addProduct(Playstation);
        venta1.addProduct(Xbox);
        venta1.addProduct(Switch2);

        try {
            venta1.getProduct(venta1.getProducts().size()+1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error with the required index.");
        }

        Sale venta2 = new Sale();

        try {
            venta2.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Caught custom EmptySaleException:" + e.getMessage());
        }


    }

}

