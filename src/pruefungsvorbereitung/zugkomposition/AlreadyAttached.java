package pruefungsvorbereitung.zugkomposition;

public class AlreadyAttached extends VehicleException{
    public AlreadyAttached() {
        super("Already Attached");
    }

    public AlreadyAttached(String message) {
        super(message);
    }
}
