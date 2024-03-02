package w02.aufgabeHaus;

public class Auto {
    private String typ;
    private String farbe;

    public Auto(String typ, String farbe) {
        this.typ = typ;
        this.farbe = farbe;
    }

    public String getTyp() {
        return typ;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "typ='" + typ + '\'' +
                ", farbe='" + farbe + '\'' +
                '}';
    }
}
