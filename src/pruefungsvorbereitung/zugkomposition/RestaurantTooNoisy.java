package pruefungsvorbereitung.zugkomposition;

public class RestaurantTooNoisy extends VehicleException{
    public RestaurantTooNoisy() {
        super("Ein Schlafwagen und Restaurantwagen dürfen nicht aneinander gehängt werden");
    }

    public RestaurantTooNoisy(String message) {
        super(message);
    }
}
