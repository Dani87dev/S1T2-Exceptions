package n2exercici1;

public class CharTooLongException extends RuntimeException {

    public CharTooLongException() {
        super("You have a lot of characters for a char type");
    }

}
