package w04.bus;

public class NotReadyForDepartureException extends RuntimeException{
    public NotReadyForDepartureException() {
        super("Es müssen zwei Busfahrer im Bus sein");
    }

    public NotReadyForDepartureException(String message) {
        super(message);
    }
}
