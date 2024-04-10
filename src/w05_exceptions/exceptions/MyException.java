package w05_exceptions.exceptions;

public class MyException extends RuntimeException {
    public MyException() {
        super("Keine 2 Erlaubt");
    }
    public MyException(String errorMessage) {
        super(errorMessage);
    }
}