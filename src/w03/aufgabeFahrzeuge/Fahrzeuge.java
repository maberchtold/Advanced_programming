package w03.aufgabeFahrzeuge;

public class Fahrzeuge {
    private String fahrzeughalter;
    private String farbe;
    private int anzahlRaeder;

    public Fahrzeuge(String fahrzeughalter, String farbe, int anzahlRaeder) {
        this.fahrzeughalter = fahrzeughalter;
        this.farbe = farbe;
        this.anzahlRaeder = anzahlRaeder;
    }

    public String getFahrzeughalter() {
        return fahrzeughalter;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }

    public void setFahrzeughalter(String fahrzeughalter) {
        this.fahrzeughalter = fahrzeughalter;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setAnzahlRaeder(int anzahlRaeder) {
        this.anzahlRaeder = anzahlRaeder;
    }

    @Override
    public String toString() {
        return "Fahrzeuge{" +
                "fahrzeughalter='" + fahrzeughalter + '\'' +
                ", farbe='" + farbe + '\'' +
                ", anzahlRaeder=" + anzahlRaeder +
                '}';
    }
}
