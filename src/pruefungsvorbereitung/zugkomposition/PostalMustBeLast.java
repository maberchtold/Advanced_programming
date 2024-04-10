package pruefungsvorbereitung.zugkomposition;

public class PostalMustBeLast extends VehicleException{
    public PostalMustBeLast() {
        super("Der Postwagon muss der letzte wagon sein oder darf nur von Postwagons gefolgt werden.");
    }

    public PostalMustBeLast(String message) {
        super(message);
    }
}
