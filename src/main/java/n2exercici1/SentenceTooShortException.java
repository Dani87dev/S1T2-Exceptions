package n2exercici1;

public class SentenceTooShortException extends RuntimeException {

    public SentenceTooShortException() {
        super("You need to introduce a sentence with more than 15 characters");
    }
}
