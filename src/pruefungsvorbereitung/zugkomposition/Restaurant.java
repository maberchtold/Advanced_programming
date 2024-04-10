package pruefungsvorbereitung.zugkomposition;

public class Restaurant extends Wagon{
    public Restaurant(String name) {
        super(name);
    }

    public void attach(Vehicle next) throws VehicleException{
        super.attach(next);

        if (next instanceof  Sleeper){
            throw new RestaurantTooNoisy();
        }
    }
}
