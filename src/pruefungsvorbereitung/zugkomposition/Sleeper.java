package pruefungsvorbereitung.zugkomposition;

public class Sleeper extends Wagon{
    public Sleeper(String name) {
        super(name);
    }

    public void attach(Vehicle next) throws VehicleException{
        super.attach(next);

        if (next instanceof  Restaurant){
            throw new RestaurantTooNoisy();
        }
    }
}
