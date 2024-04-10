package pruefungsvorbereitung.zugkomposition;

public class Postal extends Vehicle{
    public Postal(String name) {
        super(name);
    }
    
    public void attach(Vehicle next) throws VehicleException{
        super.attach(next);

        if (!(next instanceof Postal)){
            throw new PostalMustBeLast();
        }
    }

}
