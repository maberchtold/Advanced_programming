package pruefung;

public class TooHeavyException extends RuntimeException{
    public TooHeavyException() {
        super("Die eingepackten lebensmittel sind zu schwer");
    }

    public TooHeavyException(String message) {
        super(message);
    }
}
