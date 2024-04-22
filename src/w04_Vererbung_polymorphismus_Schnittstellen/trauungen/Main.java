package w04_Vererbung_polymorphismus_Schnittstellen.trauungen;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Jerry");
        Man man2 = new Man("Tim");
        Woman woman = new Woman("Michaela");
        Teenager teenager = new Teenager("Joe");

        man.marry(woman);
        man2.marry(woman);

        System.out.println(man);
        System.out.println(woman);
        System.out.println(teenager);
    }
}
