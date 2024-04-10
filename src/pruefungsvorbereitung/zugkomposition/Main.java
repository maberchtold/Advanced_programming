package pruefungsvorbereitung.zugkomposition;

public class Main {
    public static void main(String[] args) {
        Diesel diesel = new Diesel("Diesel");
        Electric electric = new Electric("Electric");
        Box box = new Box("Box");
        Sleeper sleeper = new Sleeper("Sleeper");
        Restaurant restaurant = new Restaurant("Restaurant");
        Single single = new Single("Single");
        Double doubleWagon = new Double("Double");
        Postal postal = new Postal("Postal");

        try{
            diesel.attach(electric);
            electric.attach(sleeper);
            sleeper.attach(single);
            single.attach(restaurant);
            restaurant.attach(doubleWagon);
            doubleWagon.attach(postal);
            postal.attach(box);
            diesel.print();
        }catch (VehicleException e){
            System.out.println(e.getMessage());
        }

    }
}
