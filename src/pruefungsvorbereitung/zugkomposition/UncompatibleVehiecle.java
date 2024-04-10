package pruefungsvorbereitung.zugkomposition;

public class UncompatibleVehiecle extends VehicleException{
    public UncompatibleVehiecle() {
        super("Die Waggons sind nicht miteinander kompatibel");
    }

    public UncompatibleVehiecle(String message) {
        super(message);
    }
}
