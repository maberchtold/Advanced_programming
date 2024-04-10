package pruefungsvorbereitung.zugkomposition;

public abstract class Coach extends Vehicle {
    public Coach(String name) {
        super(name);
    }

    public void attach(Vehicle next) throws VehicleException{
        super.attach(next);

        if (next instanceof Wagon){
            throw new UncompatibleVehiecle();
        }
    }
}
