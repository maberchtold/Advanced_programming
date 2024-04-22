package w04_Vererbung_polymorphismus_Schnittstellen.bus;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        boolean retBool;
        int money;

        Passagier p1 = new Passagier("Berchtrold", "Matteo", false);
        Passagier p2 = new Passagier("Guschti", "Guschtaf", false);
        Passagier p3 = new Passagier("Trump", "Donald", true);
        Passagier p4 = new Passagier("Hawking", "Stephen", true);
        Fahrer f1 = new Fahrer("Jackson", "Michael", 40000, 13);
        Fahrer f2 = new Fahrer("Joe", "Jamal", 60000, 22);

        p1.pay();
        p2.pay();
        p3.pay();
        p4.pay();

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

        money = bus.ride();
        System.out.println("The total is: "+money);

        System.out.println(bus);
    }
}
