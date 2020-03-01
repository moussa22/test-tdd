package exception;

public class InvalidListException extends RuntimeException {
    public InvalidListException(String message) {
        super(message);
    }
}
