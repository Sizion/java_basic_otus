package home_work_8.arrays.exception;

public class AppArrayDataException extends RuntimeException{
    public AppArrayDataException() {
    }

    public AppArrayDataException(String message) {
        super(message);
    }

    public AppArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
