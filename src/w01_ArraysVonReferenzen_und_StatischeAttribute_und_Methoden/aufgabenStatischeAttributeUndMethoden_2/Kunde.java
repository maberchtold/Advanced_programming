package w01_ArraysVonReferenzen_und_StatischeAttribute_und_Methoden.aufgabenStatischeAttributeUndMethoden_2;

public class Kunde {
    private static int count = 1;
    private static String name;
    private int kundennummer;

    public Kunde(String name) {
        this.name = name;
        kundennummer = count;
        count++;
    }

    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", kundennummer=" + kundennummer +
                '}';
    }
}
