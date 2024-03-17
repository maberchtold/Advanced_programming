package w04.bus;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        boolean retBool;

        Passagier p1 = new Passagier("Berchtrold", "Matteo");
        Passagier p2 = new Passagier("Guschti", "Guschtaf");
        Passagier p3 = new Passagier("Trump", "Donald");
        Passagier p4 = new Passagier("Hawking", "Stephen");
        Fahrer f1 = new Fahrer("Jackson", "Michael", 40000, 13);
        Fahrer f2 = new Fahrer("Joe", "Jamal", 60000, 22);

        retBool =  bus.bookAndBoard(p1, 0,0);
        System.out.println(retBool);
        retBool = bus.bookAndBoard(p2, 0,1);
        System.out.println(retBool);
        retBool = bus.bookAndBoard(p3, 1,3);
        System.out.println(retBool);
        retBool = bus.bookAndBoard(p4, 2,3);
        System.out.println(retBool);

        System.out.println("Bus drivers");
        retBool = bus.prepareForDeparture(f1);
        System.out.println(retBool);
        retBool = bus.prepareForDeparture(f2);
        System.out.println(retBool);

        retBool = bus.ride();
        System.out.println(retBool);

        System.out.println(bus);
    }
}
