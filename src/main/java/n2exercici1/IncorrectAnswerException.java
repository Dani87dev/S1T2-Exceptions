package n2exercici1;

public class IncorrectAnswerException extends RuntimeException{

    public IncorrectAnswerException() {
        super("Only 'y' or 'n' are correct answers");
    }

}
