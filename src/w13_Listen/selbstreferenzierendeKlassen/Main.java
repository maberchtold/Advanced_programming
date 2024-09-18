package w13_Listen.selbstreferenzierendeKlassen;

public class Main {
    public static void main(String[] args) {
        List liste = new List();
        liste.addAtEnd(2);
        liste.addAtEnd(4);
        liste.addAtEnd(6);
        liste.addAtEnd(8);
        liste.addAtEnd(10);
        liste.addAtEnd(12);
        liste.addAtEnd(14);
        liste.addAtEnd(16);
        liste.addAtIndex(88,5);
        liste.printList();
        //liste.removeAtEnd();
    }
}
