package w02_Composition.aufgabeFussball;

public class MannschaftMain {
    public static void main(String[] args) {
        Position goalie = new Position("Goalie");
        Position abwehr = new Position("Abwehr");
        Position mittelfeld = new Position("Mittelfeld");
        Position sturm = new Position("Sturm");

        Spieler s1 = new Spieler("Meier","Andreas",15, goalie);
        Spieler s2 = new Spieler("Heisenberg","Peter",16);
        s2.setPosition(sturm);
        Spieler s3 = new Spieler("Imboden","Max",19);
        s2.setPosition(sturm);

        UCMannschaft ucm = new UCMannschaft(11);
        ucm.setSpieler(s1);
        ucm.setSpieler(s2);
        ucm.setSpieler(s3);

        System.out.println(ucm);
    }
}
