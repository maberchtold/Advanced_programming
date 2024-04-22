package w03_Composition.aufgabeFahrzeuge;

public class Auto extends Fahrzeuge{
    private int jahrErstzulassung;
    private int anzTueren;
    private int anzPs;

    public Auto(String fahrzeughalter, String farbe, int anzahlRaeder, int jahrErstzulassung, int anzTueren, int anzPs) {
        super(fahrzeughalter, farbe, anzahlRaeder);
        this.jahrErstzulassung = jahrErstzulassung;
        this.anzTueren = anzTueren;
        this.anzPs = anzPs;
    }

    public int getJahrErstzulassung() {
        return jahrErstzulassung;
    }

    public int getAnzTueren() {
        return anzTueren;
    }

    public int getAnzPs() {
        return anzPs;
    }

    public void setJahrErstzulassung(int jahrErstzulassung) {
        this.jahrErstzulassung = jahrErstzulassung;
    }

    public void setAnzTueren(int anzTueren) {
        this.anzTueren = anzTueren;
    }

    public void setAnzPs(int anzPs) {
        this.anzPs = anzPs;
    }

    @Override
    public String toString() {
        return super.toString()+"Auto{" +
                "jahrErstzulassung=" + jahrErstzulassung +
                ", anzTueren=" + anzTueren +
                ", anzPs=" + anzPs +
                '}';
    }
}
