package n1exercici1;

public class Main {

    public static void main(String[] args) {


        Product playstation = new Product("Playstation5", 499.99);
        Product xbox = new Product("Xbox", 349.95);
        Product switch2 = new Product("Switch2", 435.50);

        Sale sale1 = new Sale();

        sale1.addProduct(playstation);
        sale1.addProduct(xbox);
        sale1.addProduct(switch2);

        try {
            sale1.getProduct(sale1.getAllProducts().size() + 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error with the required index.");
        }

        Sale sale2 = new Sale();

        try {
            sale2.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Caught custom EmptySaleException:" + e.getMessage());
        }


    }

}

