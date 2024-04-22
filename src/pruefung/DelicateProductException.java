package pruefung;

public class DelicateProductException extends RuntimeException{
    public DelicateProductException() {
        super("Auf delikate produkte dürfen keine anderen produkte gelegt werden");
    }

    public DelicateProductException(String message) {
        super(message);
    }
}
