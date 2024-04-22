package w01_ArraysVonReferenzen_und_StatischeAttribute_und_Methoden.aufgabenStatischeAttributeUndMethoden_2;

import java.util.Scanner;

public class KundeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kunde kunde;

        for (int i = 0; i < 10; i++) {
            System.out.print("Geben Sie den Namen des Kunden ein: ");
            String name = scanner.nextLine();
            kunde = new Kunde(name);
            System.out.println(kunde);
        }

    }
    /*
    Teilaufgabe g)
    count: Diese Variable ist statisch und wird im Speicher nur einmal für die gesamte Laufzeit des Programms gespeichert. Sie wird initialisiert mit dem Wert 1 (sie wird mit 1 initialisiert, da in Ihrer Klasse die Variable count initialisiert wurde mit 1.) und wird bei jeder Instanziierung eines Kunde-Objekts inkrementiert.

    name: Diese Variable wird für jeden Kunden im Speicher gespeichert (In diesem Beispiel überschrieben, da die gleiche Referenz verwendet wird) und enthält den Namen des Kunden, den der Benutzer über die Konsole eingegeben hat.

    kundennummer: Diese Variable wird für jeden Kunden im Speicher gespeichert und enthält die Kundennummer. Die Kundennummer wird aus der statischen Variablen count generiert und dann inkrementiert, um sicherzustellen, dass jeder Kunde eine eindeutige Kundennummer erhält.

    Teilaufgabe h)
    Ja dies wäre möglich. Jedoch würde der Name einmalig im Speicher initialisiert werden und immer wieder überschrieben werden

    Teilaufgabe i)
    In diesem Beistpiel kann die statische Methode Main nur direkt auf die statische Variabel count zugreifen.
    Die main() Methode muss statisch sein, damit sie ohne Instanz der Klasse aufgerufen werden kann.
    */
}
