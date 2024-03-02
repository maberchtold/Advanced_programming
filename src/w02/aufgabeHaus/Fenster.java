package w02.aufgabeHaus;

public class Fenster {
    private int breite;
    private int laenge;
    private String vorhangFarbe;

    public Fenster(int breite, int laenge, String vorhangFarbe) {
        this.breite = breite;
        this.laenge = laenge;
        this.vorhangFarbe = vorhangFarbe;
    }

    public int getBreite() {
        return breite;
    }

    public int getLaenge() {
        return laenge;
    }

    public String getVorhangFarbe() {
        return vorhangFarbe;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public void setVorhangFarbe(String vorhangFarbe) {
        this.vorhangFarbe = vorhangFarbe;
    }

    @Override
    public String toString() {
        return "Fenster{" +
                "breite=" + breite +
                ", laenge=" + laenge +
                ", vorhangFarbe='" + vorhangFarbe + '\'' +
                '}';
    }
}
