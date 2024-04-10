package pruefungsvorbereitung.zugkomposition;

public abstract class Wagon extends Vehicle {
    public Wagon(String name) {
        super(name);
    }

    public void attach(Vehicle next) throws VehicleException{
        super.attach(next);

        if (next instanceof Coach){
            throw new UncompatibleVehiecle();
        }
    }
}
