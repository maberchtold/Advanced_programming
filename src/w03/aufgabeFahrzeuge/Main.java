package w03.aufgabeFahrzeuge;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto("matteo", "grün", 4, 2002, 5, 600);
        Dreirad d = new Dreirad("elia", "yellow", 3, true, true);

        System.out.println(a);
        System.out.println(d);
    }
}
