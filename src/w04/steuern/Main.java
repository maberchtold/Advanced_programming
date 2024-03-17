package w04.steuern;

public class Main {
    public static void main(String[] args) {
        Bread weissbrot = new Bread("Weissbrot", 200);
        System.out.println(weissbrot.getPriceTTC());

        Water wasser = new Water("Evian", 100);
        System.out.println(wasser.getPriceTTC());

        Jewel juwel = new Jewel("Ruby", 3000000);
        System.out.println(juwel.getPriceTTC());

        Car car = new Car("Mercedes", 2500000);
        System.out.println(car.getPriceTTC());

        Computer computer = new Computer("Lenovo", 200000);
        System.out.println(computer.getPriceTTC());

        Bulb bulb = new Bulb("LED", 700);
        System.out.println(bulb.getPriceTTC());
    }
}
