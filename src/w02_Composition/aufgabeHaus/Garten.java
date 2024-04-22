package w02_Composition.aufgabeHaus;

import java.util.Arrays;

public class Garten {
    private int laenge;
    private int breite;
    private Baum[] baeume;

    public Garten(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public Garten(int laenge, int breite, String[] baumArten) {
        this.laenge = laenge;
        this.breite = breite;
        baeume = new Baum[baumArten.length];
        for (int i = 0; i < baeume.length; i++){
            baeume[i] = new Baum(baumArten[i]);
        }
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBreite() {
        return breite;
    }

    public Baum[] getBaeume() {
        return baeume;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public void setBaeume(String[] baumArten) {
        baeume = new Baum[baumArten.length];
        for (int i = 0; i < baeume.length; i++){
            baeume[i] = new Baum(baumArten[i]);
        }
    }

    @Override
    public String toString() {
        return "Garten{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                ", baeume=" + Arrays.toString(baeume) +
                '}';
    }
}
