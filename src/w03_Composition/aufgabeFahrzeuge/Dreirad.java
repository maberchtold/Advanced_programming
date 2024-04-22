package w03_Composition.aufgabeFahrzeuge;

public class Dreirad extends Fahrzeuge{
    private boolean hatKlingel;
    private boolean hatSchiebestange;

    public Dreirad(String fahrzeughalter, String farbe, int anzahlRaeder, boolean hatKlingel, boolean hatSchiebestange) {
        super(fahrzeughalter, farbe, anzahlRaeder);
        this.hatKlingel = hatKlingel;
        this.hatSchiebestange = hatSchiebestange;
    }

    public boolean isHatKlingel() {
        return hatKlingel;
    }

    public boolean isHatSchiebestange() {
        return hatSchiebestange;
    }

    public void setHatKlingel(boolean hatKlingel) {
        this.hatKlingel = hatKlingel;
    }

    public void setHatSchiebestange(boolean hatSchiebestange) {
        this.hatSchiebestange = hatSchiebestange;
    }

    @Override
    public String toString() {
        return super.toString()+"Dreirad{" +
                "hatKlingel=" + hatKlingel +
                ", hatSchiebestange=" + hatSchiebestange +
                '}';
    }
}
