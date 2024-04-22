package pruefung;

public class BagFullException extends RuntimeException{
    public BagFullException() {
        super("Die Tasche ist voll");
    }

    public BagFullException(String message) {
        super(message);
    }
}
