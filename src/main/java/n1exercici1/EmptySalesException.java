package n1exercici1;

public class EmptySalesException extends RuntimeException {

    public EmptySalesException() {
        super("Per fer una venda primer has d’afegir productes");
    }
}
