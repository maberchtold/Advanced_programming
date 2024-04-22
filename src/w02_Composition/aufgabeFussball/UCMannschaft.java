package w02_Composition.aufgabeFussball;

public class UCMannschaft {
    private Mannschaft mannschaft;

    public UCMannschaft(int anzahl) {
        mannschaft = new Mannschaft(anzahl);
    }

    public void setSpieler(Spieler s) {
        mannschaft.setSpieler(s);
    }

    public int getNrGoalie(){
        return mannschaft.getNrPosition("Goalie");
    }

    @Override
    public String toString() {
        return "UCMannschaft{" +
                "mannschaft=" + mannschaft +
                '}';
    }
}
