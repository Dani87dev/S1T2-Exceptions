package n2exercici1;

public class IncorrectAnswerException extends RuntimeException {

    public IncorrectAnswerException() {
        super("Error, only 'y' or 'n' are correct answers");
    }

}
