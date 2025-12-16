package n1exercici1;

public class Main {

    public static void main (String [] args) {


        Product Playstation = new Product("Playstation5", 400);
        Product Xbox = new Product("Xbox", 350);
        Product Switch2 = new Product ("Switch2", 450);

        Sale venta1 = new Sale();

        venta1.addProduct(Playstation);
        venta1.addProduct(Xbox);
        venta1.addProduct(Switch2);

        try {
            venta1.getProduct(venta1.products.size()+1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error al accedir al index requerit");
        }

    }

}

