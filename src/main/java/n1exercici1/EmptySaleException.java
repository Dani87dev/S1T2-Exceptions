package n1exercici1;

public class EmptySaleException extends RuntimeException {

    public EmptySaleException() {
        super("To make a successful sale you must first add products");
    }
}
