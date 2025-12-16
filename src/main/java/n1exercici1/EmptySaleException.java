package n1exercici1;

public class EmptySaleException extends RuntimeException {

    public EmptySaleException() {
        super("To make a succesfull sale you must first add products");
    }
}
