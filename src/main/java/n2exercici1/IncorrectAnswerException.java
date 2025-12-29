package n2exercici1;

public class IncorrectAnswerException extends RuntimeException {

    public IncorrectAnswerException() {
        super("Error, only 's' or 'n' are correct answers");
    }

}
